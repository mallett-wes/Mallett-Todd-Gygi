/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import Exceptions.GameControllerException;
import app.Main;

/**
 *
 * @author hiramtodd
 */
public class StartExistingGameView extends View{
    
    public StartExistingGameView(){
        super("Please enter the name of the file you would like to load");
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
     
    
    public boolean doAction(String[] input){
        String filePath = input[0];
        GameController gameController = new GameController();
        
        try{
           gameController.startExistingGame(filePath); 
        }catch(GameControllerException e){
            ErrorView.display(this.getClass().getName(), "An Error Occurred: " + e.getMessage());
            return false;
        }
        
        console.println("Welcome back to your game, " + Main.getGame().getMainPlayer().getName() + "!");
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        return true;
    } 

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
