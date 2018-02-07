package view;

import controller.GameController;
import model.Game;

import java.io.InputStreamReader;
import java.util.Scanner;

public class GameView {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public int welcomeToGame(){
        System.out.println("Welcome to the Game!");
        System.out.println("What would you like to do: ");
        System.out.println("1. Start a new game");
        System.out.println("2. Loan a saved game");

        return scanner.nextInt();
    }
}
