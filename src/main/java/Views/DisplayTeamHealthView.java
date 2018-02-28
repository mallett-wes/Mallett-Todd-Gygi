/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.CharacterController;
import model.Character;
import app.Main;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author wesmallett
 */
public class DisplayTeamHealthView {
    private Scanner scanner;
    
    public DisplayTeamHealthView(){
        scanner = new Scanner(new InputStreamReader(System.in));
    }
    
    public void display(){
        boolean valid = false;
        boolean nextStep = false;
        do{
            valid = showTeamHealth();
        }while(!valid);
        
        do{
            nextStep = nextAction(getInputs());
        }while(!nextStep);
    }
    
    private String[] getInputs(){
        String[] input = new String[1];
        System.out.println("E - Return to Game Play");
        System.out.println("M - Go to Main Menu");
        
        String result = scanner.nextLine().trim().toUpperCase();

        while(result.length() < 1){
            System.out.println("You must enter a non-blank value.");
            result = scanner.nextLine().trim().toUpperCase();
        }

        input[0] = result;

        return input;
    }
    
    private boolean showTeamHealth(){
        CharacterController characterController = new CharacterController();
        for(Character member: Main.getTeam().getMembers()){
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
        
        return true;
    } 
    
    private boolean nextAction(String[] inputs){
        String menuItem;
        
        menuItem =inputs[0];
        
        if(menuItem.equals("E")){
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.displayGameMenuView();
            
        }else if(menuItem.equals("M")){
            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.displayMainMenuView();
            
        }else{
            System.out.println("Invalid menu item");
        }
        
        return true;
    }
}
