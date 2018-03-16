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
import model.Scenes;
import model.RiverCrossingScene;
import model.hotelScene;
import model.TownScene;
import model.FortScene;
import model.GeneralStoreScene;

/**
 *
 * @author Kyrie Gygi
 */
public class MapController {

    private static Scenes[] start;
    private static Scenes[] mountain;
    private static Scenes[] desert;
    private static Scenes[] city;
    private static Scenes[] end;
    private static Scenes[] plains;
    private static Scenes[] river;
    
    
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
            location.setVisited(false);
            locations[i][x] = location;
        }
        
    }
}

public enum SceneType{
    mountain,
    river,
    plains,
    desert,
    city,
    start,
    end
    }

private static Scene[][] createScenes(int rowCount, int columnCount){
    if(rowCount < 1 || columnCount < 1){
            return null;
        }
    
   Scenes scene = new Scenes();
   ArrayList <Scenes> scenes = new ArrayList<>();
   RiverCrossingScene riverCrossingScene = new RiverCrossingScene();
   scenes.add(riverCrossingScene);
   TownScene townScene = new TownScene();
   scenes.add(townScene);
   GeneralStoreScene generalStoreScene = new GeneralStoreScene();
   FortScene fortScene = new FortScene();
   scenes.add(fortScene);
   hotelScene hotelScene = new hotelScene();
   scenes.add(hotelScene);
   
           
            

            
        
                
    }
    
  
    

    
    
    
}




private static void assignScenesToLocations(Scene[] scenes, Location[][] locations){
    
}
}



