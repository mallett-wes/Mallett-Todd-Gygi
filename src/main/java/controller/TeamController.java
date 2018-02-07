package controller;

import model.Character;
import model.Pace;
import model.Team;
import view.CharacterView;
import view.TeamView;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamController {

    private Team teamModel;
    private TeamView teamView;

    public TeamController(Team model, TeamView view){
        teamView = view;
        teamModel = model;
    }

    public void setName(String name){teamModel.setTeamName((name));}

    public void setMembers(ArrayList<Character> members){
        teamModel.setMembers(members);
    }

    public void setPace(Pace pace){
        teamModel.setPace(pace);
    }

    public Team createTeam(Character mainPlayer){
        CharacterController characterController = new CharacterController(new Character(), new CharacterView());
        ArrayList<Character> teamMembers = new ArrayList<>();

        teamView.selectTeamMembers();

        teamMembers.add(characterController.selectCharacterForTeam());
        teamMembers.add(mainPlayer);
        setMembers(teamMembers);

        setName(teamView.nameTeam());

        setPace(teamView.setPace());

        return this.teamModel;
    }

}
