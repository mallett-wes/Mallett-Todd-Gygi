/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import app.Main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import Controller.MapController;
import static Controller.MapController.createMap;
import java.util.HashMap;
import model.Map;

/**
 *
 * @author Kyrie Gygi
 */
public class PrintTeamTravelledView extends View{
    
    public PrintTeamTravelledView(){
        super("Would you like to know how many squares you have traveled? Y/N?");
    }
    
    private void printReport(){
        PrintWriter outputStream = null;
        MapController locationsVisited = new MapController();
        HashMap<visted, locationsVisited> MapController = MapController.createMap(0, 0);
        outputStream.println("\n\n   Your distance travelled:               ");
        for(HashMap.Entry<visited, locationsVisited> MapController : createMap.entrySet()){
              
              }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("I encountered an error."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
}
