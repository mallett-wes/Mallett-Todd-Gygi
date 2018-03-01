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
public class GameView {
    private Scanner scanner;
    
    public GameView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }
    
    public void display(){
        boolean valid = false;
        do{
            valid = doAction(getInputs());
        }while(!valid);
        
        SelectTeamView selectTeamView = new SelectTeamView();
        selectTeamView.displaySelectTeamView();
    }
    
    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println(Main.getCharacter().getName() + ", please enter the name of your game: ");
        
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
        
        Game newGame = gameController.createNewGame(inputs[0], Main.getCharacter());
        Main.setGame(newGame);
        
        return true;
    }    
}
