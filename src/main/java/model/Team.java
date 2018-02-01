package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Team implements Serializable{

    private String teamName;
    private Pace pace;
    private ArrayList<Character> members = new ArrayList<Character>();
    private HashMap<SupplyType, Integer> supplies = new HashMap<SupplyType, Integer>();
    //private Location currentLocation;

    public String getTeamName() { return teamName; }

    public void setTeamName(String teamName) { this.teamName = teamName; }

    public Pace getPace() {
        return pace;
    }

    public void setPace(Pace pace) {
        this.pace = pace;
    }

    public List<Character> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Character> members) {
        this.members = members;
    }

    public HashMap<SupplyType, Integer> getSupplies() {
        return supplies;
    }

    public void setSupplies(HashMap<SupplyType, Integer> supplies) {
        this.supplies = supplies;
    }

//    public Location getCurrentLocation() {
//        return currentLocation;
//    }
//
//    public void setCurrentLocation(Location currentLocation) {
//        this.currentLocation = currentLocation;
//    }

    public Team(){

    }

    @Override
    public String toString() {
        return "Team{" +
                "name=" + teamName +
                ", pace=" + pace +
                ", members=" + members +
                ", supplies=" + supplies +
                //", currentLocation=" + currentLocation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (teamName != null ? !teamName.equals(team.teamName) : team.teamName != null) return false;
        if (pace != team.pace) return false;
        if (members != null ? !members.equals(team.members) : team.members != null) return false;
        return supplies != null ? supplies.equals(team.supplies) : team.supplies == null;
    }

    @Override
    public int hashCode() {
        int result = pace.hashCode();
        result = 31 * result + members.hashCode();
        result = 31 * result + (supplies != null ? supplies.hashCode() : 0);
        //result = 31 * result + currentLocation.hashCode();
        return result;
    }

    public void addCharacterToTeam(Character character){
        if(!members.contains(character)) {
            this.members.add(character);
        }
    }

    public void removeCharacterFromTeam(Character character){
        if(members.contains(character)){
            members.remove(character);
        }
    }

    public List<Character> getLivingMembers(){
        ArrayList<Character> livingMembers = new ArrayList<Character>();

        for(Character member:this.members){
            if(member.getHealthRating() != 0){
                livingMembers.add(member);
            }
        }
        return livingMembers;
    }

    public void addSuppliesToStock(SupplyType supply, int quantity){
        this.supplies.put(supply, quantity);
    }

    public void removeSuppliesFromStock(SupplyType supply, int quantity) throws Exception {
        int currentQuantity = this.supplies.get(supply);
        int residualQuantity = currentQuantity - quantity;
        if(residualQuantity < 0){
            throw new Exception();
        }else{
            this.supplies.put(supply, residualQuantity);
        }
    }
}
