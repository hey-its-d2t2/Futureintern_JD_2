# Rock, Paper, Scissors Game 🎮

This project is being built as part of my internship at **Future Intern**. It represents **Task No. 2**, where I was assigned to develop a web-based **Rock, Paper, Scissors Game**. The project is designed with **Java Spring Boot** for the backend, while the frontend is built using **Thymeleaf**, **HTML**, **CSS**, and **JavaScript**. The game allows users to challenge the computer to the classic game of Rock, Paper, Scissors, with a user-friendly and responsive interface.


## 🚀 Features

- **Interactive Gameplay**: Allows users to select between Rock, Paper, or Scissors and play against a computer.
- **Real-Time Results**: Displays the result (win, lose, or tie) instantly after every move.
- **Responsive UI**: The game is responsive and works well across devices, including desktops, tablets, and mobiles.
- **Simple and Clean Design**: Designed with a focus on simplicity, making it easy to play and understand.
- **Replayable**: After each game, a modal appears with the result and the option to play again.

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML5, CSS3, JavaScript
- **Templating Engine**: Thymeleaf
- **Version Control**: Git
- **Build Tool**: Maven
- **Testing**: Postman for API testing and manual testing
- **Tools**: IntelliJ IDEA, Visual Studio Code

## 📜 How to Play

1. Choose your move: **Rock**, **Paper**, or **Scissors**.
2. Click the **Play** button to submit your choice.
3. The computer will randomly choose one of the options.
4. The result (win, lose, or tie) will be displayed along with both choices.
5. A pop-up modal will show the final result with the option to **Play Again**.

## 📂 Project Structure



```
RockPaperScissorsGame/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── rockpaperscissors/
│   │   │               ├── controller/
│   │   │               │   └── GameController.java
│   │   │               ├── model/
│   │   │               │   └── Game.java
│   │   │               └── service/
│   │   │                   └── GameService.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   └── game.html
│   │   │   └── application.properties
│   └── test/
├── screenshots/
│   └── game.png
└── README.md
```

## 🖥️ Setup & Run Locally

To run this project on your local machine, follow these steps:

### Prerequisites

- Java 8, 17 or above
- Maven
- IDE (IntelliJ IDEA/Visual Studio Code)

### Installation

1. Clone the repository:

   ```
   git clone https://github.com/your-username/RockPaperScissorsGame.git
   cd RockPaperScissorsGame
   ```
2. Build the project:
    ```
     mvn clean install
   ```
3. Run the application:
   ```
      mvn spring-boot:run
   ```
### Open your browser and navigate to http://localhost:8080/game to play!

## ⚙️ API Endpoints
- **GET	/game**	Displays the game page.
- **POST	/play**	Processes the user's move.
## 🎨 UI and Features
- **Game Board:** A clean interface where users can make their choice (Rock, Paper, or Scissors) and see real-time results.
- **Modal Pop-up:** A modal dialog box shows the result after each round.
 - **Responsive Layout:** The game looks good on mobile, tablet, and desktop devices.
## 📸 Screenshots
- Game Interface	Result Modal

    ![RockPaperGam](https://github.com/user-attachments/assets/84c03c05-ae29-4963-aac2-2406b71cef69)

## 💡 Future Enhancements
- Implementing a scoreboard to track wins, losses, and ties over multiple games.
- Introducing an AI-based difficulty mode.
- Adding sounds for better game feedback.
### 📧 Contact
**Deepak Singh**
- For any questions or feedback, please contact me at deepsinghkumar01@gmail.com.
- Feel free to reach out for any questions or contributions!
