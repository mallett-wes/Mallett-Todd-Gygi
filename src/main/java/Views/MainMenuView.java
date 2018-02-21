/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.CharacterController;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author wesmallett
 */
public class MainMenuView {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public MainMenuView(){

    }

    public void displayMainMenuView(){
        doAction(getInputs());
    }

    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("Start new game: n");
        System.out.println("Restart existing game: r");
        System.out.println("Get help on how to play the game: h");
        System.out.println("Exit: e");
        String result = scanner.nextLine().trim().toLowerCase();

        while(result.length() < 1){
            System.out.println("You must enter a letter to choose an option!.");
            result = scanner.nextLine().trim().toLowerCase();

            if(result.equals("e")) {
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }

    private void startNewGame(){
    
    };
    
    private void restartGame(){
    
    };
    
    private void getHelp(){
    
    };
    
    
    private boolean doAction(String[] inputs){
        char menuItem;
        
        menuItem = String.charAt[0];
        menuItem = menuItem.toUpperCase;
        switch(menuItem) {
            case 'N': startNewGame();
                break;
                
            case 'R': restartGame();
                break;
                
            case 'H': getHelp();
                break;
                
            case 'E': return true;
                break;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
