/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import model.Location;
import model.Map;
import model.Supplies;

/**
 *
 * @author Kyrie Gygi
 */
public class MapController {
    
    
     public static Map createMap(){
        int l;
        l = supplies.length();
        if(rowCount < 0 || columnCount < 0){
            return null;
        }
        
        if(supplies == 'null' || supplies.length() < 1){
        return null;
       
    
    }
        Map map = new Map();
        rowCount = map.getRowCount();
        columnCount = map.getColumnCount();
        Location location = new Location();
        location.createLocations(rowCount, columnCount);
        
        
     
     
     
     
     return void;
    }
    
private static Location[][] createLocations(int rowCount, int columnCount){
         
     return void;
     }


private static Question[] createQuestions(){
    
}

private static Scene[] createScenes(){
    
}

private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes){
    
}

private static void assignItemsToScenes(Supplies[] supply, Scene[] scenes){
    
}

private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
    
}
}



