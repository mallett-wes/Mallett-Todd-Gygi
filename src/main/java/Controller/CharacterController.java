/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Pace;
import model.Character;
import model.Team;

/**
 *
 * @author wesmallett
 */
public class CharacterController {
    
    public Character selectMainCharacter(String name){
        Character character = new Character();
        character.setMainPlayer(true);
        character.setDescription("This is the main player of the gameModel.");

        if(name == null || name.equals("")){
            return null;
        }
        character.setName(name);

        //characterModel.setSpecialSkill(characterView.characterSkills());

        //return this.characterModel;
        return character;
    }

    public int calculateIndividualCharacterHealth(Pace pace, int lastNourishment, int characterStamina) throws Exception {
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
    
    public double calculateTeamAverageHealth(Team team, int lastNourishment){
        if(team == null){
            return -1;
        }
        
        if(team.getMembers().size() < 1){
            return -1;
        }
        
        ArrayList<Integer> health = new ArrayList<>();
        int memberHealth = 0;
        for(Character teamMember : team.getMembers()){
            try{
                memberHealth = calculateIndividualCharacterHealth(team.getPace(), lastNourishment, teamMember.getStamina());
            }catch(Exception e){
                return -1;
            }
            health.add(memberHealth);
        }
        
        int sum = 0;
        for(int i=0; i < health.size() ; i++){
            sum += health.get(i);
        }
       
        return sum / health.size();
    }
    
}
