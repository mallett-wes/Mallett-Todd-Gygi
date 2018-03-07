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
public class StartExistingGameView extends View{
    
    public StartExistingGameView(){
       super("Please enter the name of the game you would like to play: ");
    }
    
    @Override
    public boolean doAction(String input){
        GameController gameController = new GameController();
        
        Game game = gameController.startExistingGame(input);
        Main.setGame(game);
        
        return true;
    } 
}
