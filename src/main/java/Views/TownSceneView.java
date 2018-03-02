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
public class TownSceneView {
    private Scanner scanner;
    
    
    public void display(){
        boolean test = false;
        do{
            test = doAction(getInputs());
            
        }while(test = false);
}
    private String getInputs(){
        System.out.println("Welcome to town!");
        System.out.println("To return to the trail enter 'A'");
        System.out.println("To enter the General Store enter 'G'");
        System.out.println("To enter the Hotel enter 'H'");
        String input = scanner.nextLine().trim().toUpperCase();
        return input;
    }
    
    private boolean doAction(String input){
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

