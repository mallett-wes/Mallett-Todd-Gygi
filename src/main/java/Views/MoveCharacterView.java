/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.MapController;
import Exceptions.MapControlException;
import app.Main;
import java.util.Scanner;
import model.Character;
import model.Location;

/**
 *
 * @author wesmallett
 */
public class MoveCharacterView extends View{
    
    private String[] getInputs(){
        Scanner keyboard = new Scanner(System.in);
        String[] inputs = new String[2];
        
        System.out.println("Please select coordinates on the map that you would like to move to, enter the x coordinate first: ");
        String input1 = keyboard.nextLine();
        
        System.out.println("Now enter the y coordinate: ");
        String input2 = keyboard.nextLine();
        
        inputs[0] = input1;
        inputs[1] = input2;
        
        return inputs;
    }

    public boolean doAction(String[] value) throws NumberFormatException{
        int row = -1;
        int column = -1;
        try{
         row = Integer.parseInt(value[0]);
         column = Integer.parseInt(value[1]);
        }catch(NumberFormatException e){
            System.out.println("You must enter a valid row and column. " + e.getMessage());
        }
        
        Character character = Main.getGame().getMainPlayer();
        MapController mapController = new MapController();
        Location newLocation;
        
        try{
            newLocation = mapController.moveActor(character, row, column);
        }catch(MapControlException e){
            System.out.println("There was a problem moving your character to your desired location. " + e.getMessage());
            return false;
        }
        
        System.out.println(newLocation.getScene().getDescription());
        return true;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
