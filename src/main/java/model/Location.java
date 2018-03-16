/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hiramtodd
 */
public class Location implements Serializable {
    private int row;
    private int column;
    private String plantLifePresent;
    private String waterPresent;
    private int amountRemaingToSaltLake;
    private int amountTraveledFromNauvoo;
    private String weatherCondition;
    private String locationType;
    private Scenes scene;

    public Scenes getScene() {
        return scene;
    }

    public void setScene(Scenes scene) {
        this.scene = scene;
    }
<<<<<<< Updated upstream

   
   

    
=======
>>>>>>> Stashed changes
    
    public int getRow() {
        return this.row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return this.column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    public String getPlantLifePresent() {
        return this.plantLifePresent;
    }
    
    public void setPlantLifePresent(String plantLifePresent) {
        this.plantLifePresent = plantLifePresent;
    }
    
    public String getwaterPresent() {
        return this.waterPresent;
    }
    
    public void setWaterPresent(String waterPresent) {
        this.waterPresent = waterPresent;
    }
    
    public int getAmountRemaingToSaltLake() {
        return this.amountRemaingToSaltLake;
    }
    
    public void setAmountRemainingToSaltLake(int amountRemaingToSaltLake) {
        this.amountRemaingToSaltLake = amountRemaingToSaltLake;
    }
    
    public int getAmountTraveledFromNauvoo() {
        return this.amountTraveledFromNauvoo;
    }
    
    public void setAmountTraveledFromNauvoo(int amountTraveledFromNauvoo) {
        this.amountTraveledFromNauvoo = amountTraveledFromNauvoo;
    }
    
    public String getWeatherCondition() {
        return this.weatherCondition;
    }
    
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
    
    public String getLocationType() {
        return this.locationType;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", plantLifePresent=" + plantLifePresent + ", waterPresent=" + waterPresent + ", amountRemaingToSaltLake=" + amountRemaingToSaltLake + ", amountTraveledFromNauvoo=" + amountTraveledFromNauvoo + ", weatherCondition=" + weatherCondition + ", locationType=" + locationType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        hash = 89 * hash + Objects.hashCode(this.plantLifePresent);
        hash = 89 * hash + Objects.hashCode(this.waterPresent);
        hash = 89 * hash + this.amountRemaingToSaltLake;
        hash = 89 * hash + this.amountTraveledFromNauvoo;
        hash = 89 * hash + Objects.hashCode(this.weatherCondition);
        hash = 89 * hash + Objects.hashCode(this.locationType);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.amountRemaingToSaltLake != other.amountRemaingToSaltLake) {
            return false;
        }
        if (this.amountTraveledFromNauvoo != other.amountTraveledFromNauvoo) {
            return false;
        }
        if (!Objects.equals(this.plantLifePresent, other.plantLifePresent)) {
            return false;
        }
        if (!Objects.equals(this.waterPresent, other.waterPresent)) {
            return false;
        }
        if (!Objects.equals(this.weatherCondition, other.weatherCondition)) {
            return false;
        }
        if (!Objects.equals(this.locationType, other.locationType)) {
            return false;
        }
        return true;
    }
    public void createLocations(int row, int column){
        
    }
  //  public Location() {
        
  //  } 
}