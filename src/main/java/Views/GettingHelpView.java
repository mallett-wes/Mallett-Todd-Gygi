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
 * @author hiramtodd
 */
public class GettingHelpView {
    private Scanner scanner;
    
    public GettingHelpView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }
    
    public void display(){
        boolean valid = false;
        do{
            valid = doAction(getInputs());
        }while(!valid);       
    }
    
    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("G - What is the goal of the game?");
        System.out.println("M - How to move");
        System.out.println("E - Estimate the number of resources");
        System.out.println("H - Harvest resources");
        System.out.println("D - Delivering resources to warehouse");
        System.out.println("Q - Exit Help Menu");
        
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a non-blank value or enter Q to quit the game.");
            result = scanner.nextLine().trim().toUpperCase();

            if(result.equals("Q")) {
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }
    
    private boolean doAction(String[] inputs){
        String selection = inputs[0];
        
        switch(selection){
            case "G":
                System.out.println("This is the goal!");
                break;
            case "M":
                System.out.println("This is how you move.");
                break;
            case "E":
                System.out.println("This is how you estimate the number of resources");
                break;
            case "H":
                System.out.println("This is how you harvest resources.");
                break;
            case "D":
                System.out.println("This is how you deliver resources to the warehouse.");
                break;
            case "Q":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;
            default:
                System.out.println("Invalid Menu Option.");
        }
        
        return true;
    }
}
