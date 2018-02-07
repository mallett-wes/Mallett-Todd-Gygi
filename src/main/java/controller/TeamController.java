package controller;

import model.Character;
import model.Team;
import view.CharacterView;
import view.TeamView;

import java.util.ArrayList;

public class TeamController {

    private Team teamModel;
    private TeamView teamView;

    public TeamController(Team model, TeamView view){
        teamView = view;
        teamModel = model;
    }

    public Team createTeam(Character mainPlayer){
        CharacterController characterController = new CharacterController(new Character(), new CharacterView());
        ArrayList<Character> teamMembers = new ArrayList<>();

        teamView.selectTeamMembers();

        teamMembers.add(characterController.selectCharacterForTeam());
        teamMembers.add(mainPlayer);
        teamModel.setMembers(teamMembers);

        teamModel.setTeamName(teamView.nameTeam());

        teamModel.setPace(teamView.setPace());

        return this.teamModel;
    }

}
