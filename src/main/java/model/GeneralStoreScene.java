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
public class GeneralStoreScene extends Scenes implements Serializable{
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void purchaseSupply(int quantity){
    }
    public void sellSupply(int quantity){
    }
    }
            
    
    
