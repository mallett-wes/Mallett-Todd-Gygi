/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import Exceptions.GameControllerException;
import app.Main;
import model.Game;

/**
 *
 * @author wesmallett
 */
public class MainMenuView extends View{

    public MainMenuView(){
        super("What would you like to do?" + "\nN - Start new game"
        +"\nR - Restart existing game" +"\nH - Get help on how to play the game"
        +"\nQ - Exit");
    }

    private void startNewGame(){
       GameController gameController = new GameController();
       Game newGame = null;
       
       try{
          newGame = gameController.createNewGame(Main.getCharacter()); 
       }catch(GameControllerException e){
           System.out.println("An error occurred: " + e.getMessage());
       }
       
       Main.setGame(newGame);
       
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
    
    @Override
    public boolean doAction(String input){
        String menuItem;
        
        menuItem = input;

        switch(menuItem) {
            case "N": 
                this.startNewGame();
                break;
                
            case "R": 
                this.restartGame();
                break;
                
            case "H": 
                getHelp();
                break;
            
            case "Q":
                System.out.println("Thanks for playing! Good bye!");
                System.exit(0);
                
            case "E": 
                return false;
            default: 
                System.out.println("Invalid menu item");
                return false;
        }
        
        return true;
    }
}
