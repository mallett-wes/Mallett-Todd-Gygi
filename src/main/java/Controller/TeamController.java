/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import app.Main;
import java.util.ArrayList;
import java.util.List;
import model.Team;
import model.Character;
import model.Pace;

/**
 *
 * @author wesmallett
 */
public class TeamController {

    public TeamController(){
    }

    public Team createTeam(List<Character> teamMembers){
        Team team = new Team();

        teamMembers.add(Main.getCharacter());
        
        if(teamMembers.size() > 0){
            team.setMembers((ArrayList<Character>)teamMembers);
        }
        
        team.setPace(Pace.AVERAGE);

        return team;
    }
    
}
