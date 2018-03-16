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
import model.SceneType;

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
    
private static void assignScenesToLocations(Map map, Scenes[] scenes){
    
    Location[][] locations = map.getLocations();
    locations[0][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
    locations[0][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[0][8].setScene(scenes[SceneType.city.ordinal()]);
    locations[1][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][7].setScene(scenes[SceneType.city.ordinal()]);
    locations[1][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[1][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[2][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][4].setScene(scenes[SceneType.river.ordinal()]);
    locations[3][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][6].setScene(scenes[SceneType.city.ordinal()]);
    locations[3][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[3][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][5].setScene(scenes[SceneType.desert.ordinal()]);
    locations[4][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[4][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][2].setScene(scenes[SceneType.mountain.ordinal()]);
    locations[5][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[5][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[6][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[7][9].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[8][9].setScene(scenes[SceneType.end.ordinal()]);
    locations[9][0].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][1].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][2].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][3].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][4].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][5].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][6].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][7].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][8].setScene(scenes[SceneType.plains.ordinal()]);
    locations[9][9].setScene(scenes[SceneType.plains.ordinal()]);
    
    
    
}





}



