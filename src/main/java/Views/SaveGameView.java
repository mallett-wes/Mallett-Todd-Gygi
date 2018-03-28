/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import Exceptions.GameControllerException;
import app.Main;
import java.io.IOException;
import model.Game;

/**
 *
 * @author wesmallett
 */
public class SaveGameView extends View{
    
    public SaveGameView(){
        super("What would you like to save your game as? ");
    }
    
    @Override
    public void display(){
        boolean done = false;
        do{
            String[] value = this.getInputs();
            if(value[0].toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        }while(!done);
    }
                
    public String[] getInputs(){
        String[] inputs = new String[1];
        String input1 = getInput().toLowerCase();
        inputs[0] = input1;
        
        return inputs;
    }
    
    private boolean doAction(String[] input){
        Boolean done = false;
        String fileName = input[0];
        Game currentGame = Main.getGame();
        String filePath = null;
        try{
            GameController gameController = new GameController();            
            filePath = gameController.saveGame(currentGame, fileName + ".dat");
        }catch(GameControllerException | IOException e){
            console.println("There was an error saving your game: " + e.getMessage());
        }
        
        if(!(filePath == null)){
            console.println("File was saved successfully to " + filePath);
            done = true;
        }
        
        return done;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
