/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author wesmallett
 */
public class MainMenuView {
    private Scanner scanner;

    public MainMenuView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }

    public void displayMainMenuView(){
        doAction(getInputs());
    }

    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("What would you like to do?");
        System.out.println("N - Start new game");
        System.out.println("R - Restart existing game");
        System.out.println("H - Get help on how to play the game");
        System.out.println("Q - Exit");
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a letter to choose an option or enter Q to quit.");
            result = scanner.nextLine().trim().toUpperCase();

            if(result.equals("Q")) {
                System.out.println("Thanks for playing! Good bye!");
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }

    private void startNewGame(){
        GameView gameView = new GameView();
        gameView.display();   
    };
    
    private void restartGame(){
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
    };
    
    private void getHelp(){
        GettingHelpView helpView = new GettingHelpView();
        helpView.display();   
    };
    
    
    private boolean doAction(String[] inputs){
        String menuItem;
        
        menuItem =inputs[0];

        switch(menuItem) {
            case "N": 
                startNewGame();
                break;
                
            case "R": 
                restartGame();
                break;
                
            case "H": 
                getHelp();
                break;
            
            case "Q":
                System.out.println("Thanks for playing! Good bye!");
                System.exit(0);
                
            case "E": 
                return true;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
