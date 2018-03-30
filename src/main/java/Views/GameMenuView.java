/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.CharacterController;
import app.Main;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Game;
import model.Location;
import model.Supplies;
import model.SupplyType;


/**
 *
 * @author wesmallett
 */
public class GameMenuView extends View{
    

    public GameMenuView(){
      super("What would you like to do?" 
            + "\nM - Move Forward" 
            + "\nR - Rest" 
            + "\nS - Save Your Game"
            + "\nP - Change Pace" 
            + "\nV - View Map"
            + "\nG - Go to General Store"
            + "\nI - View Supplies"
            + "\nH - View Your Team's Health"
            + "\nE - Main Menu"
      );
    }
    
    private void viewTeamSupplies(){
        HashMap<SupplyType, Integer> teamSupplies = Main.getGame().getTeam().getSupplies();
        if(teamSupplies.size() < 1){
            ErrorView.display(this.getClass().getName(), "You have no supplies on hand.");
        }else{
           System.out.println("Your team's current supplies are: ");
           
           for(HashMap.Entry<SupplyType, Integer> item : teamSupplies.entrySet()){
               SupplyType supply = item.getKey();
            System.out.println(supply.getKey() + "....." + item.getValue());
           }
        }
        
        PrintTeamSuppliesView printSuppliesView = new PrintTeamSuppliesView();
        printSuppliesView.display();
        
        returnToMenu();
    }

    private void changePace(){
        System.out.println("Pace Change");
    };
    
    private void moveForward(){
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
        
        DayEndView dayEndView = new DayEndView();
        dayEndView.display();
    };
    
    private void rest(){
        System.out.println("RESTING.....STUB");
    };
    
    private void displayMap(){
        System.out.println("This is the map of the game!");
        System.out.println(createMap());
        
        returnToMenu();
    }
    
    private void returnToMenu(){
        ReturnMenuView returnToMenuView = new ReturnMenuView();
        returnToMenuView.display();
    }
    
    public String createMap(){
        Game game = Main.getGame();
        Location[][] locations = game.getMap().getLocations();
        String map = "     1    2    3    4    5    6   7    8    9   10 \n";
        String row = "";
        String headerRow = "     1    2    3    4    5    6   7    8    9   10 ";
        
        for(int i = 0; i<10; i++){
            row = "";
            row += "-----------------------------------------------------\n" + (i + 1);
            
            for(int x = 0; x<10; x++){
                row += " | " ;
                Location location = locations[i][x];
                if(location.isVisited()){
                    row += "**";
                }else{
                    row += "??";
                }
            }
            row += "|\n";
            map += row;
        }
        
        return map;
    }
    
    private void displayHealth(){
        CharacterController characterController = new CharacterController();
        for(model.Character member: Main.getGame().getTeam().getMembers()){
            int currentHealth = 0;
            try{
                currentHealth = characterController.calculateIndividualCharacterHealth(Main.getGame().getTeam().getPace(), 2, member.getStamina());
                
                if(Main.getCharacter().equals(member)){
                    ErrorView.display(this.getClass().getName(), member.getName() + "(you) ..... " + currentHealth);
                }else{
                    ErrorView.display(this.getClass().getName(), member.getName() + " ..... " + currentHealth);
                }
                
                
            }catch(Exception e){
                if(Main.getCharacter().equals(member)){
                    ErrorView.display(this.getClass().getName(), member.getName() + "(you) ..... Could Not Calculate");
                }else{
                    ErrorView.display(this.getClass().getName(), member.getName() + " ..... Could Not Calculate");
                }
            }    
        }
        
        System.out.println("Your team's total average health is " + characterController.calculateTeamAverageHealth(Main.getGame().getTeam(), 2));
        
        returnToMenu();
    }
    
    private void saveGame(){
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }
     
    @Override
    public boolean doAction(String input){
        String menuItem;
        
        menuItem = input.toUpperCase();

        switch(menuItem) {
            case "M": 
                moveForward();
                break;
            case "S":
                saveGame();
                break;
            case "R": 
                rest();
                break;
            case "V":
                displayMap();
                break;
            case "P": 
                changePace();
                break;
            case "G":
                GeneralStoreView generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
            case "H": 
                displayHealth();
                break;
            case "I":
                viewTeamSupplies();
                break;          
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
               
            default: ErrorView.display(this.getClass().getName(), "Invalid menu item");
        }
        
        return true;
    }
}
