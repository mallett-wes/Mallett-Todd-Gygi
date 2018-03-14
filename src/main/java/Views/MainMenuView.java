/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.GameController;
import Controller.CharacterController;
import java.io.InputStreamReader;

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
       int returnValue = GameController.createNewGame(CharacterController.selectMainCharacter());
               if (returnValue < 0){
                   System.out.println("ERROR - Failed to create new game");
               }
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
                restartGame();
                break;
                
            case "H": 
                getHelp();
                break;
            
            case "Q":
                System.out.println("Thanks for playing! Good bye!");
                System.exit(0);
                
            case "E": 
                return true;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
