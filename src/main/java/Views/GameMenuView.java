/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.CharacterController;
import app.Main;
import java.util.HashMap;
import model.Game;
import model.Location;
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
            + "\nG - Purchase Supplies"
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
           console.println("Your team's current supplies are: ");
           
           for(HashMap.Entry<SupplyType, Integer> item : teamSupplies.entrySet()){
               SupplyType supply = item.getKey();
            console.println(supply.getKey() + "....." + item.getValue());
           }
        }
        
        PrintTeamSuppliesView printSuppliesView = new PrintTeamSuppliesView();
        printSuppliesView.display();
        
        returnToMenu();
    }

    private void changePace(){
        console.println("Pace Change");
    };
    
    private void moveForward(){
        MoveCharacterView moveCharacterView = new MoveCharacterView();
        moveCharacterView.display();
        
        DayEndView dayEndView = new DayEndView();
        dayEndView.display();
    };
    
    private void rest(){
        console.println("RESTING.....STUB");
    };
    
    private void displayMap(){
        console.println("This is the map of the game!");
        console.println(createMap());
        
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
                    console.println(member.getName() + "(you) ..... " + currentHealth);
                }else{
                    console.println(member.getName() + " ..... " + currentHealth);
                }
                
                
            }catch(Exception e){
                if(Main.getCharacter().equals(member)){
                    console.println(member.getName() + "(you) ..... Could Not Calculate");
                }else{
                    console.println(member.getName() + " ..... Could Not Calculate");
                }
            }    
        }
        
        console.println("Your team's total average health is " + characterController.calculateTeamAverageHealth(Main.getGame().getTeam(), 2));
        
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
                PurchaseSuppliesView view = new PurchaseSuppliesView();
                view.display();
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
    
//    private void viewTeamStamina(){
//        HashMap<Character, Integer> teamStamina = Main.getName().getStamina();
//        if(teamStamina.size() < 1){
//            ErrorView.display(this.getClass().getName(), "Select Yes or No.");
//        } else {
//           System.out.println("Here are your team member's staminas: ");
//
//           for(HashMap.Entry<Character, Integer> level : teamStamina.entrySet()) {
//            Character stamina = level.getKey();
//            System.out.println(stamina.getKey() + "....." + level.getValue());
//           }
//        }
//
//        PrintTeamStaminaView printStaminaView = new PrintTeamStaminaView();
//        printStaminaView.display();
//
//        returnToMenu();
//    }
}
