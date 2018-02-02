package app;

import model.Character;
import model.Pace;
import model.SupplyType;
import model.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import model.Game;

public class Main {
    public static void main(String... args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please give your trek a name:  ");
        Game game = new Game();
        String gameName = reader.readLine();
        game.setName(gameName);
        
        System.out.println("Please enter what season you would like to start " + gameName + " in: ");
        String startingSeason = reader.readLine();
        game.setSeason(startingSeason);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = dateFormat.parse("08/01/1836");
        game.setDate(startDate);
        
        System.out.print("Enter the name of your character: ");
        String name = reader.readLine();

        System.out.println("Which Skill do you want?");
        System.out.println("1. Hunting");
        System.out.println("2. Fishing");
        System.out.println("3. Dancing");
        String input = reader.readLine();
        String specialSkill = null;
        switch(input){
            case "1":
                specialSkill = "Hunting";
                break;
            case "2":
                specialSkill = "Fishing";
                break;
            case "3":
                specialSkill = "Dancing";
                break;
        }

        Character mainPlayer = createCharacter(name, specialSkill, "This is a test", true);

        System.out.println("Now Let's create your team! Who do you want? (Select one)");
        System.out.println("1. Bill the fisher");
        System.out.println("2. Bob the gatherer");
        System.out.println("3. Mary the medicine woman");
        String choice = reader.readLine();

        String teammate = null;
        switch(choice){
            case "1":
                teammate = "bill";
                break;
            case "2":
                teammate = "bob";
                break;
            case "3":
                teammate = "mary";
                break;
        }

        Character member1 = createCharacter(teammate, "dancing", "test test", false);
        ArrayList<Character> teamMembers = new ArrayList<>();
        teamMembers.add(mainPlayer);
        teamMembers.add(member1);

        Team team = assembleTeam(teamMembers);
        
        System.out.println("What would you like to call your team: ");
        String teamName = reader.readLine();
        team.setTeamName(teamName);

        System.out.println("Your Game: " + game.toString());
        System.out.println("Here is your team: " + team.toString());
        System.out.println("Here is you: " + mainPlayer.toString());
        System.out.println("Here are your current supplies: " + team.getSupplies().toString());
    }

    private static Character createCharacter(String name, String skill, String description, boolean isMainPlayer){
        Character mainCharacter = new Character();
        mainCharacter.setName(name);
        mainCharacter.setMainPlayer(isMainPlayer);
        mainCharacter.setSpecialSkill(skill);
        mainCharacter.setDescription(description);
        mainCharacter.setHealthRating(10);
        return mainCharacter;
    }

    private static Team assembleTeam(ArrayList<Character> members){
        Team team = new Team();
        team.setMembers(members);
        team.setPace(Pace.AVERAGE);
        HashMap<SupplyType, Integer> supplies = new HashMap<SupplyType, Integer>();
        supplies.put(SupplyType.FOOD, 10);
        supplies.put(SupplyType.WATER, 100);
        team.setSupplies(supplies);
        //team.setCurrentLocation(new Location());
        return team;
    }
}
