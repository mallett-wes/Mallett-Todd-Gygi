/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.Scanner;
/**
 *
 * @author hiramtodd
 */
public class DayEndView {
    private Scanner scanner;
    
    public void display(){
        boolean done = false;
        do{
            done = doAction(getInputs());
            
        }while(done = false);
}
    private String getInputs(){
        System.out.println("To go fishing, enter 'F'");
        System.out.println("To go hunting, enter 'K'");
        System.out.println("To rest, enter 'R'");
        System.out.println("Get help, enter 'H'");
        String input = scanner.nextLine().trim().toUpperCase();
        return input;
    }
    
    private void getHelp(){
        GettingHelpView helpView = new GettingHelpView();
        helpView.display();
    };
    
    private boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "F":
                RiverView riverView = new RiverView();
                riverView.display();
                break;
                
            case "K":
                HuntingView huntingView = new HuntingView();
                huntingView.display();
                break;
                
            case "R":
                GameView gameView = new GameView();
                gameView.display();
                break;
                
            case "H": 
                getHelp();
                break;
                
            default:
            System.out.println("That is an invalid ");
            break;
        
        }
        return true;
    }
}