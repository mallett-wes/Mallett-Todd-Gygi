/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import app.Main;
import java.io.InputStreamReader;
import java.util.Scanner;
import model.Game;

/**
 *
 * @author hiramtodd
 */
public class StartExistingGameView {
   private Scanner scanner;
    
    public StartExistingGameView(){
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
        System.out.println("Please enter the name of the game you would like to play: ");
        
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a non-blank value or enter Q to quit.");
            result = scanner.nextLine().trim().toUpperCase();

            if(result.equals("Q")) {
                System.exit(0);
            }
        }

        input[0] = result;

        return input;
    }
    
    private boolean doAction(String[] inputs){
        GameController gameController = new GameController();
        
        Game game = gameController.startExistingGame(inputs[0]);
        Main.setGame(game);
        
        return true;
    } 
}
