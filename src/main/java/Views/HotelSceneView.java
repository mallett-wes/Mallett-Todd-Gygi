/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


/**
 *
 * @author Kyrie Gygi
 */
public class HotelSceneView extends View {
  public HotelSceneView(){   
   super("Welcome to the hotel!" + "/nTo rest your party enter 'P'" + 
         "\nTo view new party members enter 'N'" + 
         "\nTo exit the Hotel enter 'T'");
  }
    
   
   
   @Override
    public boolean doAction(String input){
        String selection;
        selection = input;
        
        switch(selection){
            case "P":
                GameView GameView = new GameView();
                GameView.display();
                break;
            case "N":
                SelectTeamView selectTeamView = new SelectTeamView();
                selectTeamView.display();
                break;
            case "T":
                TownSceneView townSceneView = new TownSceneView();
                townSceneView.display();
                break;
            default:
            System.out.println("That is an invalid ");
            break;        
        }
        
        return true; 
    }
}