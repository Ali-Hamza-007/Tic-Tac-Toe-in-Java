❌ Tic Tac Toe - Android App ⭕
A classic, interactive Tic Tac Toe game built natively for Android using Java. This app features a clean UI with Material Design components and supports two different gameplay modes to keep things interesting! 🎮

✨ Features
Dual Game Modes: * Single Player: Challenge a built-in AI that makes random strategic moves. 🤖

Multiplayer: Play locally with a friend on the same device. 👥

Smart Game Logic: * Automatic win detection for horizontal, vertical, and diagonal matches. 🏆

Detects draws when the board is full. 🤝

Interactive "Reset" functionality to quickly start a new round. 🔄

Material UI: Uses MaterialButton for a tactile, responsive grid experience. 🎨

Seamless Navigation: A dedicated home screen to choose your game mode before playing. 🏠

🛠️ Built With
Language: Java ☕

Framework: Android SDK (AppCompat, Material Components) 🤖

Navigation: Intent-based transitions between screens. 🗺️

Logic: Custom game engine with Random class for AI moves. 🧠

🚀 How It Works
The Home Screen: Users select between "Single Player" and "Multiplayer." This choice is passed to the game screen via an Intent extra called gameMode.

The Gameplay: * Players take turns placing "O" and "X" on a 3x3 grid.

In Single Player mode, the triggerAiMove() function automatically finds an empty spot and makes a move immediately after the user.

The game state is managed by a gameActive boolean to prevent moves after a win or draw.
