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
public class Scenes implements Serializable {
    private String name;
    private String description;
    private SceneType sceneType;

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Scenes{" + "name=" + name + ", description=" + description + '}';
    }
    
   // public void enterScene(){}
   // public void talkToCharacter(){}
   // public void exitScene(){}
   // public void showMenu(){}
    
        
    }
