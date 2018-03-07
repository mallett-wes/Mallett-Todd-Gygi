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
public class GeneralStoreView extends View {
   GeneralStoreView(){
       super("Welcome to the General Store" +
             "\nThis will be different in the final version");
   }
   
   @Override
    public boolean doAction(String input){
        String menuItem;
        
        menuItem = input;

        switch(menuItem) {
        }
        return true;
    }
    
}
