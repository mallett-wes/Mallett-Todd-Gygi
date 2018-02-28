/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Game;
import model.Character;

/**
 *
 * @author Kyrie Gygi
 */
public class GameController {
    
    public Game createNewGame(String gameName, Character player){
        Game game = new Game();
        game.setMainPlayer(player);
        game.setName(gameName);
        
        return game;
    }
    
    public Game startExistingGame(String gameName){
        return new Game();
    }
    
}
