/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import app.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kyrie Gygi
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    protected final BufferedReader keyboard = Main.getInFile();
    protected final PrintWriter console = Main.getOutFile();
    
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
        boolean valid = false;
        String value = null;
        
        while(!valid){
            System.out.println("\n" + this.displayMessage);
            
            try {
                value = keyboard.readLine();
            } catch (IOException ex) {
                System.out.println("Error Reading Input");
            }
            
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
