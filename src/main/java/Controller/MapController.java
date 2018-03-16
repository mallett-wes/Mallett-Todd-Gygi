/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.ArrayList;
import model.Location;
import model.Map;
import model.Supplies;

/**
 *
 * @author Kyrie Gygi
 */
public class MapController {
    
    
     public static Map createMap(int rowCount, int columnCount){
         
        if(rowCount < 1 || columnCount < 1){
            return null;
        }
        
        Map map = new Map();
        map.setRowCount(rowCount);
        map.setColumnCount(columnCount);
        
        Location[][] locations = createLocations(rowCount, columnCount);
        
        Scene[] scenes = createScenes();
     return void;
    }
    
private static Location[][] createLocations(int rowCount, int columnCount){
    if(rowCount < 1 || columnCount < 1){
            return null;
        }
    
    Location[][] locations = new Location[10][10];
    for(int i = 0;i<10;i++){
        for(int x = 0; x<10; x++){
            Location location = new Location();
            location.setRow(rowCount);
            location.setColumn(columnCount);
            locations[i][x] = location;
        }
        
    }
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



