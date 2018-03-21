/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Exceptions.RiverSceneControllerException;
import model.Game;
import model.RiverCrossingScene;
/**
 *
 * @author Kyrie Gygi
 */
public class RiverSceneController {
    
    public double calculateRiverDepth(String namedSeason) throws RiverSceneControllerException{
        double depth = 0;
        
        if(namedSeason.equals("Winter")){
            depth = .65 * 5;
        }else if(namedSeason.equals("Spring")){
            depth = .85 * 5;
        }else if(namedSeason.equals("Fall")){
            depth = .65 * 5;
        }else if(namedSeason.equals("Summer")){
            depth = .45 * 5;
        }else {
            throw new RiverSceneControllerException("That is not an acceptable season");
        }
               
        return depth;
    }
    
}
