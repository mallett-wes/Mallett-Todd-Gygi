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
public class RiverCrossingScene extends Scenes implements Serializable {
private double probabilityOfSuccess;
private int riverDepth;
private double successfulCrossing;

    public RiverCrossingScene(){
        this.setSceneType(SceneType.river);
        this.setDescription("This is the river crossing scene");
        this.setName("River Crossing Scene");
    }
    public double getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

    public void setProbabilityOfSuccess(double probabilityOfSuccess) {
        this.probabilityOfSuccess = probabilityOfSuccess;
    }

    public int getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(int riverDepth) {
        this.riverDepth = riverDepth;
    }

    public double getSuccessfulCrossing() {
        return successfulCrossing;
    }

    public void setSuccessfulCrossing(double successfulCrossing) {
        this.successfulCrossing = successfulCrossing;
    }

public double crossRiver(double probabilityOfSuccess, int riverDepth, double SuccessfulCrossing){
 
    return 0;
}
        
        

public void calculateCrossingSuccess(double probabilityOfSuccess, int riverDepth)
{
//private int success;

 //   public int getSuccess() {
 //       return success;
  //  }

  //  public void setSuccess(int success) {
  //      this.success = success;
 //   }




//public void dropSupplies(){
//}

//void crossUnsuccessful(){
//}

}
}
