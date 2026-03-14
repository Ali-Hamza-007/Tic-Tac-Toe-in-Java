package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.button.MaterialButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_reset;
    String PLAYER_O = "O";
    String PLAYER_X = "X";
    String activePlayer = PLAYER_O;
    boolean gameActive = true;
    String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mode = getIntent().getStringExtra("gameMode");

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_reset = findViewById(R.id.btn_reset);

        MaterialButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_reset};
        for (MaterialButton btn : buttons) {
            if (btn != null) btn.setOnClickListener(this);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View view) {
        MaterialButton clickedButton = (MaterialButton) view;

        if (clickedButton.getId() == R.id.btn_reset) {
            restartGame();
            return;
        }

        if (gameActive && clickedButton.getText().toString().isEmpty()) {

            performMove(clickedButton);

            // If it's Single Player and the game is still going, let AI move
            if (gameActive && "single".equals(mode) && activePlayer.equals(PLAYER_X)) {
                triggerAiMove();
            }
        }
    }


    private void performMove(MaterialButton btn) {
        btn.setText(activePlayer);

        if (checkWin()) {
            Toast.makeText(this, "Player " + activePlayer + " Wins!", Toast.LENGTH_LONG).show();
            gameActive = false;
        } else if (isBoardFull()) {
            Toast.makeText(this, "It's a Draw!", Toast.LENGTH_LONG).show();
            gameActive = false;
        } else {
            // Switch turns
            activePlayer = activePlayer.equals(PLAYER_O) ? PLAYER_X : PLAYER_O;
        }
    }

    private void triggerAiMove() {
        MaterialButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        Random random = new Random();

        boolean moved = false;
        while (!moved && !isBoardFull()) {
            int index = random.nextInt(9);
            if (buttons[index].getText().toString().isEmpty()) {
                performMove(buttons[index]);
                moved = true;
            }
        }
    }

    private boolean isBoardFull() {
        MaterialButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (MaterialButton btn : buttons) {
            if (btn.getText().toString().isEmpty()) return false;
        }
        return true;
    }

    private boolean checkWin() {
        String b1 = btn1.getText().toString();
        String b2 = btn2.getText().toString();
        String b3 = btn3.getText().toString();
        String b4 = btn4.getText().toString();
        String b5 = btn5.getText().toString();
        String b6 = btn6.getText().toString();
        String b7 = btn7.getText().toString();
        String b8 = btn8.getText().toString();
        String b9 = btn9.getText().toString();

        if (checkMatch(b1, b2, b3)) return true;
        if (checkMatch(b4, b5, b6)) return true;
        if (checkMatch(b7, b8, b9)) return true;
        if (checkMatch(b1, b4, b7)) return true;
        if (checkMatch(b2, b5, b8)) return true;
        if (checkMatch(b3, b6, b9)) return true;
        if (checkMatch(b1, b5, b9)) return true;
        if (checkMatch(b3, b5, b7)) return true;

        return false;
    }

    private boolean checkMatch(String s1, String s2, String s3) {
        return !s1.isEmpty() && s1.equals(s2) && s2.equals(s3);
    }

    private void restartGame() {
        activePlayer = PLAYER_O;
        gameActive = true;
        MaterialButton[] buttons = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
        for (MaterialButton btn : buttons) {
            btn.setText("");
        }
    }
}