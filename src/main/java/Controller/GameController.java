/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Game;
import model.Character;
import model.Supplies;
import model.Map;
import model.Location;

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
    
    public static Map createMap(int rowCount, int columnCount, Supplies[] supplies){
        int l;
        //l = supplies.length();
        l = supplies.length;
        if(rowCount < 0 || columnCount < 0){
            return null;
        }
        
      //  if(supplies == 'null' || supplies.length() < 1){
       // return null;
       
    
    //}
        Map map = new Map();
        rowCount = map.getRowCount();
        columnCount = map.getColumnCount();
        Location location = new Location();
        location.createLocations(rowCount, columnCount);
        
    }
    public Game startExistingGame(String gameName){
        return new Game();
    }
    
}
