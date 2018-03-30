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
    
    public String[] getInputs(){
        String[] inputs = new String[1];
        String input1 = getInput().toLowerCase();
        inputs[0] = input1;
        
        return inputs;
    }
     
    
    public boolean doAction(String[] input){
        String filePath = input[1];
        GameController gameController = new GameController();
        
        try{
           gameController.startExistingGame(filePath); 
        }catch(GameControllerException e){
            ErrorView.display(this.getClass().getName(), "An Error Occurred: " + e.getMessage());
            return false;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
    } 

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
