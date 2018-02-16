/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Pace;

/**
 *
 * @author wesmallett
 */
public class CharacterController {

    public int calculateHealth(Pace pace, int lastNourishment, int characterStamina) throws Exception {
        int paceFactor = 1;

        if(pace == null){
            throw new Exception("You must pass in a valid pace.");
        }

        switch(pace){
            case SLOW:
                paceFactor = 1;
                break;
            case AVERAGE:
                paceFactor = 5;
                break;
            case FAST:
                paceFactor = 10;
                break;
        }

        int nourishmentFactor = 0;

        if(lastNourishment <= 1){
            nourishmentFactor = 10;
        }else if(lastNourishment > 1 && lastNourishment <= 5){
            nourishmentFactor = 5;
        }else if(lastNourishment > 5 && lastNourishment <=10){
            nourishmentFactor = 0;
        }

        if(characterStamina <= 0){
            throw new Exception("Character Stamina must be greater than 0.");
        }

        return Math.round(nourishmentFactor * characterStamina / paceFactor);
    }
    
}
