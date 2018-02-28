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
public class GameMenuView {
    private Scanner scanner;

    public GameMenuView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }

    public void displayGameMenuView(){
        doAction(getInputs());
    }

    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("What would you like to do?");
        System.out.println("M - Move Forward");
        System.out.println("R - Rest");
        System.out.println("P - Change Pace");
        System.out.println("H - View Your Team's Health");
        System.out.println("E - Main Menu");
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a letter to choose an option.");
            result = scanner.nextLine().trim().toUpperCase();
        }

        input[0] = result;

        return input;
    }

    private void changePace(){
        System.out.println("Pace Change");
    };
    
    private void moveForward(){
        System.out.println("Moving on up");
    };
    
    private void rest(){
        System.out.println("RESTING.....STUB");
    };
    
    private void displayHealth(){
        DisplayTeamHealthView displayTeamHealthView = new DisplayTeamHealthView();
        displayTeamHealthView.display();
    }
      
    private boolean doAction(String[] inputs){
        String menuItem;
        
        menuItem =inputs[0];

        switch(menuItem) {
            case "M": 
                moveForward();
                break;
                
            case "R": 
                rest();
                break;
                
            case "P": 
                changePace();
                break;
                
            case "H": 
                displayHealth();
                break;
            
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
