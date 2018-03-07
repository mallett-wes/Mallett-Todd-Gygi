/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import model.Game;
import model.RiverCrossingScene;
/**
 *
 * @author Kyrie Gygi
 */
public class RiverSceneController {
    
    public double calculateRiverDepth(String namedSeason){
        double depth = 0;
        
        if(namedSeason=="Winter"){
            depth = .65 * 5;
        }else if(namedSeason =="Spring"){
            depth = .85 * 5;
        }else if(namedSeason =="Fall"){
            depth = .65 * 5;
        }else if(namedSeason =="Summer"){
            depth = .45 * 5;
        }else {
            System.out.println("That is not an acceptable season");
        }
               
        return depth;
    }
    
}
