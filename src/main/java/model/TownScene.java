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
public class TownScene extends Scenes implements Serializable{
    
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
    
    public void enterGeneralStore(){
    
    }
    public void enterHotel(){
    }
    
    
}
