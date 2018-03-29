/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.GameControllerException;;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Game;
import model.Character;
import model.Supplies;
import model.Map;
import app.Main;

/**
 *
 * @author Kyrie Gygi
 */
public class GameController {
    
    public Game createNewGame(Character player) throws GameControllerException{
        if(player == null){
            throw new GameControllerException("No Character Exists.");
        }
        Game game = new Game();
        MapController mapController = new MapController();
        game.setMainPlayer(player);
        Map map = mapController.createMap(10, 10);
        game.setMap(map);
        
        return game;
    }
    
    public static String[] createCharacters(){
        String[] Characters = new String[15];
        Characters[1] = "sue";
        Characters[2] = "bill";
        Characters[3] = "bob";
        Characters[4] = "henry";
        
        Character sue = new Character();
                sue.setName("Sue");
                sue.setStamina(3);
                sue.setHealthRating(8);
                sue.setSpecialSkill("Gathering");
        Character bill = new Character();
                bill.setName("Bill");
                bill.setStamina(3);
                bill.setHealthRating(8);
                bill.setSpecialSkill("Hunting");
         Character bob = new Character();
                bob.setName("Bob");
                bob.setStamina(3);
                bob.setHealthRating(8);
                bob.setSpecialSkill("Fishing");
        Character henry = new Character();
                henry.setName("Henry");
                henry.setStamina(3);
                henry.setHealthRating(8);
                henry.setSpecialSkill("Building");
                
                return Characters;
    }
    
    public static String[] createItems(){
    
        String[] Supplies = new String[7];
            Supplies[1] = "oxen";
            Supplies[2] = "food";
            Supplies[3] = "water";
            Supplies[4] = "clothing";
            Supplies[5] = "ammunition";
            Supplies[6] = "spareParts";
            
            Supplies oxen = new Supplies();
            oxen.setWeight(50);
            oxen.setPrice(100);
            
            Supplies food = new Supplies();
            food.setWeight(20);
            food.setPrice(50);
            
            Supplies water = new Supplies();
            water.setWeight(20);
            water.setPrice(10);
            
            Supplies clothing = new Supplies();
            clothing.setWeight(10);
            clothing.setPrice(15);
            
            Supplies ammunition = new Supplies();
            ammunition.setWeight(5);
            ammunition.setPrice(20);
            
            Supplies spareParts = new Supplies();
            spareParts.setWeight(35);
            spareParts.setPrice(50);
        
            
        return Supplies;
    }
    
    public Game searchForSavedGame(String gameName) throws GameControllerException{
        if(gameName.equals("")){
            throw new GameControllerException("A Game Name must be provided to load a saved game.");
        }
        
        Game game = new Game();
        return game;
    }
    
    public Game startExistingGame(String gameName)throws GameControllerException{
        if(gameName.equals("")){
            throw new GameControllerException("A Game Name must be provided to load a saved game.");
        }
        
        Game existingGame = searchForSavedGame(gameName);
        
        if(existingGame == null){
            throw new GameControllerException("Your game could not be found, sorry.");
        }else{
            return existingGame;
        }       
    }
    
    public String saveGame(Game game, String fileName) throws IOException{
        if(game == null){
            throw new GameControllerException("No game could be found to save.");
        }
        
        if(fileName == null || fileName.equals("")){
            throw new GameControllerException("You must enter a file name.");
        }
        
        FileInputStream fileStream = null;
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        Game saveGame = new Game();
        objectStream.(saveGame);
        Main.setGame(game) = saveGame;
        
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(game);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Path filePath = Paths.get(fileName);
        return filePath.toAbsolutePath().toString();
    } 
    
}
