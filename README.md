# ❌ Tic Tac Toe – Android App ⭕

A **classic and interactive Tic Tac Toe Android application** developed using **Java and the Android SDK**.  
The app features a **clean, intuitive user interface built with Material Design components** and supports **multiple gameplay modes** to deliver an engaging and enjoyable user experience. 🎮📱

---

## ✨ Key Features

### 🎯 Dual Gameplay Modes
- **Single Player Mode:** Play against a built-in AI that performs **strategic random moves** to challenge the player. 🤖🧠  
- **Multiplayer Mode:** Enjoy **local multiplayer gameplay** with a friend on the same device. 👥🎲  

### 🧩 Intelligent Game Logic
- **Automatic Win Detection:** Identifies winning combinations across **horizontal, vertical, and diagonal lines** instantly. 🏆✨  
- **Draw Detection:** Detects a **tie when the board is fully occupied without a winner**. 🤝📊  
- **Quick Reset Option:** Restart the game instantly using the **Reset functionality** to begin a new round. 🔄⚡  

### 🎨 Modern User Interface
- Designed using **Material Design principles** for a **clean, responsive, and visually appealing UI**. 🎨📐  
- Utilizes **MaterialButton components** to create a **tactile and interactive 3×3 game grid**. 🟦🟩  

### 🏠 Seamless Navigation
- A **dedicated home screen** allows users to easily select their preferred game mode before starting the match. 🚀📲  

---

## 🛠️ Technology Stack

- **Programming Language:** Java ☕💻  
- **Framework:** Android SDK *(AppCompat, Material Components)* 🤖📦  
- **Navigation:** Intent-based screen transitions between activities. 🗺️🔗  
- **Game Logic:** Custom game engine with **Random class-based AI move generation**. 🧠⚙️  

---

## 🚀 Application Workflow

### 🏠 Home Screen
Users begin by selecting either **Single Player** or **Multiplayer** mode.  
This selection is transferred to the game activity using an **Intent extra parameter (`gameMode`)**. 🔄📤  

### 🎮 Gameplay Mechanics
- Players alternate turns placing **“X” and “O”** on a **3×3 grid board**. ❌⭕  
- In **Single Player mode**, the `triggerAiMove()` method automatically selects an **available empty position** and performs the AI move immediately after the user's turn. 🤖⚡  
- The game state is controlled using a **`gameActive` boolean variable**, ensuring that **no additional moves are allowed once a win or draw has occurred**. 🔒🏁  

---

## 📌 Future Improvements
- 🤖 Implement **Minimax AI algorithm** for smarter gameplay  
- 🎨 Add **animations and sound effects** for better user experience  
- 🌐 Add **online multiplayer support**  
- 📊 Maintain **scoreboard and game statistics**

---

⭐ If you like this project, consider **starring the repository**!
