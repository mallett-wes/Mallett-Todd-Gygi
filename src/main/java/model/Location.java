package model;

import java.io.Serializable;

public class Location implements Serializable{
    private boolean isWildlifePresent;
    private boolean isWaterPresent;
    private boolean isPlantLifePresent;
    private long amountRemainingToSaltLake;
    private long amountTraveledFromNauvoo;
    private WeatherCondition weather;
    //private SceneType scene;

    public Location(){

    }

}
