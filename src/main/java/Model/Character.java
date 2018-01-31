package Model;

import java.io.Serializable;

public class Character implements Serializable {

    private String name;
    private String description;
    private String specialSkill;
    private int stamina;
    private int healthRating;
    private boolean isMainPlayer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHealthRating() {
        return healthRating;
    }

    public void setHealthRating(int healthRating) {
        this.healthRating = healthRating;
    }

    public boolean isMainPlayer() {
        return isMainPlayer;
    }

    public void setMainPlayer(boolean mainPlayer) {
        isMainPlayer = mainPlayer;
    }

    public Character(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (stamina != character.stamina) return false;
        if (healthRating != character.healthRating) return false;
        if (isMainPlayer != character.isMainPlayer) return false;
        if (name != null ? !name.equals(character.name) : character.name != null) return false;
        if (description != null ? !description.equals(character.description) : character.description != null)
            return false;
        return specialSkill != null ? specialSkill.equals(character.specialSkill) : character.specialSkill == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (specialSkill != null ? specialSkill.hashCode() : 0);
        result = 31 * result + stamina;
        result = 31 * result + healthRating;
        result = 31 * result + (isMainPlayer ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", specialSkill='" + specialSkill + '\'' +
                ", stamina=" + stamina +
                ", healthRating=" + healthRating +
                ", isMainPlayer=" + isMainPlayer +
                '}';
    }
}
