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
            + "\nS - View Supplies"
            + "\nP - Change Pace" 
            + "\nG - Go to General Store"
            + "\nH - View Your Team's Health"
            + "\nE - Main Menu"
      );
    }
    
    private void viewTeamSupplies(){
        HashMap<SupplyType, Integer> teamSupplies = Main.getTeam().getSupplies();
        if(teamSupplies.size() < 1){
            System.out.println("You have no supplies on hand.");
        }else{
           System.out.println("Your team's current supplies are: ");
           
           for(HashMap.Entry<SupplyType, Integer> item : teamSupplies.entrySet()){
               SupplyType supply = item.getKey();
            System.out.println(supply.getKey() + "....." + item.getValue());
           }
        }
        
        ReturnMenuView returnToMenuView = new ReturnMenuView();
        returnToMenuView.display();
    }

    private void changePace(){
        System.out.println("Pace Change");
    };
    
    private void moveForward(){
        System.out.println("Moving on up");
    };
    
    private void rest(){
        System.out.println("RESTING.....STUB");
    };
    
    private void displayHealth(){
        CharacterController characterController = new CharacterController();
        for(model.Character member: Main.getTeam().getMembers()){
            int currentHealth = 0;
            try{
                currentHealth = characterController.calculateHealth(Main.getTeam().getPace(), 2, member.getStamina());
                
                if(Main.getCharacter().equals(member)){
                    System.out.println(member.getName() + "(you) ..... " + currentHealth);
                }else{
                    System.out.println(member.getName() + " ..... " + currentHealth);
                }
                
                
            }catch(Exception e){
                if(Main.getCharacter().equals(member)){
                    System.out.println(member.getName() + "(you) ..... Could Not Calculate");
                }else{
                    System.out.println(member.getName() + " ..... Could Not Calculate");
                }
            }    
        }
        
        ReturnMenuView returnToMenuView = new ReturnMenuView();
        returnToMenuView.display();
    }
     
    @Override
    public boolean doAction(String input){
        String menuItem;
        
        menuItem = input;

        switch(menuItem) {
            case "M": 
                moveForward();
                break;
                
            case "R": 
                rest();
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
            case "S":
                viewTeamSupplies();
                break;          
            case "E":
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.display();
                break;
               
            default: System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
