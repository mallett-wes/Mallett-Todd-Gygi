package controller;

import model.Character;
import model.Pace;
import model.Team;
import view.CharacterView;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterController {

    private Character characterModel;
    private CharacterView characterView;

    public CharacterController(Character model, CharacterView view){
        characterModel = model;
        characterView = view;
    }

    public Character selectMainCharacter(){
        characterModel.setMainPlayer(true);
        characterModel.setDescription("This is the main player of the gameModel.");

        characterModel.setName(characterView.nameCharacter());

        characterModel.setSpecialSkill(characterView.characterSkills());

        return this.characterModel;
    }

    public Character selectCharacterForTeam(){
        characterModel.setMainPlayer(false);
        characterModel.setDescription("this is not a main player");

        String character = characterView.displayAllCharacters();
        characterModel.setName(character);

        switch(character){
            case "bill":
                characterModel.setSpecialSkill("Bow and Arrow");
                break;
            case "bob":
                characterModel.setSpecialSkill("Dancing");
                break;
            case "mary":
                characterModel.setSpecialSkill("Child bearing");
                break;
        }

        return this.characterModel;
    }

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
