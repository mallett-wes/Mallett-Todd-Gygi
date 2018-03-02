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
public class RiverCrossingView {
    private Scanner scanner;
    
    public void displayRiverCrossingView() {
        boolean done = false;
        do {
           done = doAction(getInputs());
        }
        while(done = false);
}
    private String getInputs(){
        System.out.println("You have reach a river!");
        System.out.println("If you wish too cross the river, enter 'C'");
        System.out.println("If not, enter 'N' and return to camp.");
        String input = scanner.nextLine().trim().toUpperCase();
        return input;
    }
    
    private boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "C":
                GameView GameView = new GameView();
                break;
                
            case "N":
                DayEndView dayEndView = new DayEndView();
                dayEndView.display();
                break;
                
            default:
            System.out.println("Invalid input!");
            break;
        }
        
        return true;
    }
}