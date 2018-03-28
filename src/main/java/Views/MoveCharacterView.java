/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.MapController;
import Exceptions.MapControlException;
import app.Main;
import model.Character;
import model.Location;

/**
 *
 * @author wesmallett
 */
public class MoveCharacterView extends View{
    
    public MoveCharacterView(){
        super("Please select coordinates on the map that you would like to move to, enter the x coordinate first: ");
    }
    
    @Override
    public void display(){
        boolean done = false;
        do{
            String[] value = this.getInputs();
            if(value[0].toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        }while(done = false);
    }
    
    public String[] getInputs(){
        String[] inputs = new String[2];
        
        GameMenuView gameMenuView = new GameMenuView();
        String map = gameMenuView.createMap();
        System.out.println(map);
        String xCoordinate = getInput();
        
        this.displayMessage = "Now enter the y coordinate: ";
        String yCoordinate = getInput();
        
        inputs[0] = xCoordinate;
        inputs[1] = yCoordinate;
        
        return inputs;
    }

    public boolean doAction(String[] value) throws NumberFormatException{
        int row = -1;
        int column = -1;
        try{
         row = Integer.parseInt(value[0]) - 1;
         column = Integer.parseInt(value[1]) - 1;
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
        
        System.out.println("You have reached the " + newLocation.getScene().getSceneType().toString());
        return true;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
