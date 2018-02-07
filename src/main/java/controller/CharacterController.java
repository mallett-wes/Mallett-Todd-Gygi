package controller;

import model.Character;
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
}
