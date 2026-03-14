package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class home_screen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        MaterialButton singlePlayer = findViewById(R.id.btn_single_player);
        MaterialButton multiPlayer = findViewById(R.id.btn_multiplayer);

        singlePlayer.setOnClickListener(v -> {
            Intent intent = new Intent(home_screen.this, MainActivity.class);
            intent.putExtra("gameMode", "single"); // Pass mode to next activity
            startActivity(intent);
        });

        multiPlayer.setOnClickListener(v -> {
            Intent intent = new Intent(home_screen.this, MainActivity.class);
            intent.putExtra("gameMode", "multi");
            startActivity(intent);
        });
    }

    @Override
    public void onClick(View view) {

    }
}