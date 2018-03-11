/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controller.RiverSceneController;
import model.Game;

/**
 *
 * @author hiramtodd
 */
public class RiverView extends View {
    
    public RiverView(){
        super("Welcome to the Platte River" + "\nIf you wish to cross the River Select 'C'"
                + "\nIf you wish to drop supplies Select 'D'" + "\nTo Check depth"
                + " Select 'R'" + "\nTo return to the trail press Q");
    }
    
    @Override
    public boolean doAction(String input){
        switch(input){
            case "C":
                RiverCrossingView riverCrossingView = new RiverCrossingView();
                riverCrossingView.display();
                break;
            case "D":
                
                break;
            case "R":
                Game game = new Game();
                String Season = game.getSeason();
                RiverSceneController riverSceneController = new RiverSceneController();
                double depth = riverSceneController.calculateRiverDepth(String Season);
                System.out.println("The river is " + depth + "feet deep.");
                break;
            case "Q":
                DayEndView dayEndView = new DayEndView();
                dayEndView.display();
                break;
            default:
                 System.out.println("That is an invalid choice.");
        }
            
            
            return true;
        }
    }

