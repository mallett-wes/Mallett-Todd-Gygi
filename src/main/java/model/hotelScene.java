/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Kyrie Gygi
 */
public class hotelScene implements Serializable{
    private String deadCharacters;
    private String teamMembers;
    
    public String getDeadCharacters() {
        return deadCharacters;
    }

    public void setDeadCharacters(String deadCharacters) {
        this.deadCharacters = deadCharacters;
    }

    public String getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(String teamMembers) {
        this.teamMembers = teamMembers;
    }
    
public void filterOutDeadCharacters(String deadCharacters){
    
}    
public void filterOutTeamMembers(String teamMembers){
    
}
}
