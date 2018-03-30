/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import Exceptions.GameControllerException;
import app.Main;
import java.io.InputStreamReader;
import java.util.Scanner;
import model.Game;
import Views.GameMenuView;

/**
 *
 * @author hiramtodd
 */
public class StartExistingGameView extends View{
    
    public StartExistingGameView(){
       super("Please enter the name of the game you would like to play: ");
    }
    
    
    private String[] getInputs(){
        String[] inputs = new String[1];
        System.out.println("Select a saved game");
        String input1 = Main.getInFile();
        return inputs;
    }
    @Override
    public boolean doAction(String input){
        filePath = inputs[1];
        GameController gameController = new GameController();
        Game game = null;
        
        try{
           game = gameController.startExistingGame(input); 
        }catch(GameControllerException e){
            ErrorView.display(this.getClass().getName(), "An Error Occurred: " + e.getMessage());
            return false;
        }
        GameMenuView gameMenuView = new GameMenuView();
        Main.setGame(game);
        
        return true;
    } 
}
