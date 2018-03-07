/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import java.util.Scanner;

/**
 *
 * @author Kyrie Gygi
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    public View(){
        
    }
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        boolean done = false;
        do{
            String value = this.getInput();
            if(value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        }while(done = false);
}
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while(!valid){
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.toUpperCase().trim();

            if(value.length() <1) {
              System.out.println("\n**** You must enter a value ***");
              continue;
            }
            break;
        }
        return value;
    }
    
    
}
