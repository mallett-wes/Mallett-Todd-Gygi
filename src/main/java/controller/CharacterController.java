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

    public void setCharacterName(String name){
        characterModel.setName(name);
    }

    public void setCharacterDescription(String description){
        characterModel.setDescription(description);
    }

    public void setCharacterIsMainPlayer(boolean isMainPlayer){
        characterModel.setMainPlayer(isMainPlayer);
    }

    public void setCharacterSkill(String skill){
        characterModel.setSpecialSkill(skill);
    }

    public Character selectMainCharacter(){
        setCharacterIsMainPlayer(true);
        setCharacterDescription("This is the main player of the gameModel.");

        setCharacterName(characterView.nameCharacter());

        setCharacterSkill(characterView.characterSkills());

        return this.characterModel;
    }

    public Character selectCharacterForTeam(){
        setCharacterIsMainPlayer(false);
        setCharacterDescription("this is not a main player");

        String character = characterView.displayAllCharacters();
        setCharacterName(character);

        switch(character){
            case "bill":
                setCharacterSkill("Bow and Arrow");
                break;
            case "bob":
                setCharacterSkill("Dancing");
                break;
            case "mary":
                setCharacterSkill("Child bearing");
                break;
        }

        return this.characterModel;
    }
}
