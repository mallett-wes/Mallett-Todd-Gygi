/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author hiramtodd
 */
public class Game implements Serializable{
    private String name;
    private int totalTime;
    private String season;
    private Date date;
    private Character mainPlayer;

    public Character getMainPlayer() {
        return mainPlayer;
    }

    public void setMainPlayer(Character mainPlayer) {
        this.mainPlayer = mainPlayer;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTotalTime() {
        return this.totalTime;
    }
    
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    
    public String getSeason() {
        return this.season;
    }
    
    public void setSeason(String season) {
        this.season = season;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public void setDate (Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", totalTime=" + totalTime + ", season=" + season + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.totalTime;
        hash = 67 * hash + Objects.hashCode(this.season);
        hash = 67 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.season, other.season)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }
    
    public Game() {
        
    }
}
