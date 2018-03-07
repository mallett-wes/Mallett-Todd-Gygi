/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import java.util.Scanner;
/**
 *
 * @author Kyrie Gygi
 */
public class TownSceneView extends View {
    
    
TownSceneView(){
    super("Welcome to town!" + "\nTo return to the trail enter 'A'"
    + "\nTo enter the General Store enter 'G'" + "\nTo enter the Hotel enter 'H'");
}   


   
    @Override
    public boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "A":
                GameView GameView = new GameView();
                break;
            case "G":
                GeneralStoreView generalStoreView = new GeneralStoreView();
                generalStoreView.display();
                break;
            case "H":
                HotelSceneView hotelSceneView = new HotelSceneView();
                hotelSceneView.display();
                break;
            default:
            System.out.println("That is an invalid ");
            break;
        
        }
        return true;
    }
}                                          


