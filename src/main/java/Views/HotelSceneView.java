/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Kyrie Gygi
 */
public class HotelSceneView {
        
    Scanner scanner = scanner = new Scanner(new InputStreamReader(System.in));
    
    public void display(){
        boolean test = false;
        do{
            test = doAction(getInputs());
            
        }while(test = false);
}
    private String getInputs(){
        System.out.println("Welcome to the hotel!");
        System.out.println("To rest your party enter 'P'");
        System.out.println("To view new party members enter 'N'");
        System.out.println("To exit the Hotel enter 'T'");
        String input = scanner.nextLine().trim().toUpperCase();
        return input;
    }
    
    private boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "P":
                GameView GameView = new GameView();
                GameView.display();
                break;
            case "N":
                SelectTeamView selectTeamView = new SelectTeamView();
                selectTeamView.display();
                break;
            case "T":
                TownSceneView townSceneView = new TownSceneView();
                townSceneView.display();
                break;
            default:
            System.out.println("That is an invalid ");
            break;        
        }
        
        return true; 
    }
}