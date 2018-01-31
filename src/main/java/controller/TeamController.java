package controller;

import model.Character;
import model.Pace;
import model.Team;
import view.TeamView;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamController {
    Scanner scanner = new Scanner(new InputStreamReader(System.in));

    Team teamModel = new Team();
    TeamView teamView = new TeamView();
    CharacterController characterController = new CharacterController();

    public void setName(String name){teamModel.setTeamName((name));}

    public void setMembers(ArrayList<Character> members){
        teamModel.setMembers(members);
    }

    public void setPace(Pace pace){
        teamModel.setPace(pace);
    }

    public Team createTeam(Character mainPlayer){
        ArrayList<Character> teamMembers = new ArrayList<>();
        teamView.selectTeamMembers();
        teamMembers.add(characterController.selectTeamMember());
        teamMembers.add(mainPlayer);
        setMembers(teamMembers);

        teamView.nameTeam();
        setName(scanner.nextLine());

        teamView.setPace();
        int input = scanner.nextInt();

        switch(input){
            case 1:
                setPace(Pace.SLOW);
                break;
            case 2:
                setPace(Pace.AVERAGE);
                break;
            case 3:
                setPace(Pace.FAST);
                break;
        }

        return this.teamModel;
    }

}
