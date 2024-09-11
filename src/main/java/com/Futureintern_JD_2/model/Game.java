package com.Futureintern_JD_2.model;

import java.util.Random;

public class Game {
    private String userChoice;
    private String computerChoice;
    private String result;

    public void setUserChoice(String userChoice) {
        this.userChoice = userChoice;
        this.computerChoice = generateComputerChoice();
        this.result = determineWinner();
    }

    private String generateComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    private String determineWinner() {
        if (userChoice.equals(computerChoice)) {
            return "Draw!";
        }
        switch (userChoice) {
            case "Rock":
                return (computerChoice.equals("Scissors")) ? "You Win!" : "Computer Wins!";
            case "Paper":
                return (computerChoice.equals("Rock")) ? "You Win!" : "Computer Wins!";
            case "Scissors":
                return (computerChoice.equals("Paper")) ? "You Win!" : "Computer Wins!";
            default:
                return "Invalid choice!";
        }
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String getResult() {
        return result;
    }
}
