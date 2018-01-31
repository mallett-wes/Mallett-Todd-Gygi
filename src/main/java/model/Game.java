package model;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable {

    public Game(){

    }

    private String name;
    private String season;
    private int totalTime;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", totalTime=" + totalTime +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (totalTime != game.totalTime) return false;
        if (name != null ? !name.equals(game.name) : game.name != null) return false;
        if (season != null ? !season.equals(game.season) : game.season != null) return false;
        return date != null ? date.equals(game.date) : game.date == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (season != null ? season.hashCode() : 0);
        result = 31 * result + totalTime;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
