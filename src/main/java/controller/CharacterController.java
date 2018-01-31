package controller;

import model.Character;
import view.CharacterView;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterController {

    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    Character characterModel = new Character();
    CharacterView characterView = new CharacterView();

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
        setCharacterDescription("This is the main player of the game.");

        characterView.nameCharacter();
        setCharacterName(scanner.nextLine());

        characterView.characterSkills();
        String skill = null;
        int input = scanner.nextInt();

        switch(input){
            case 1:
                skill = "Hunting";
                break;
            case 2:
                skill = "Fishing";
                break;
            case 3:
                skill = "Dancing";
                break;
        }

        setCharacterSkill(skill);
        return this.characterModel;
    }

    public Character selectTeamMember(){
        setCharacterIsMainPlayer(false);
        setCharacterDescription("this is not a main player");

        characterView.displayAllCharacters();
        int input = scanner.nextInt();

        switch(input){
            case 1:
                setCharacterName("bill");
                setCharacterSkill("Bow and Arrow");
                break;
            case 2:
                setCharacterName("bob");
                setCharacterSkill("Dancing");
                break;
            case 3:
                setCharacterName("mary");
                setCharacterSkill("Child bearing");
                break;
        }

        return this.characterModel;
    }
}
