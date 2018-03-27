/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Kyrie Gygi
 */
public class SupplyWeightControllerException  extends RuntimeException{
    
    public SupplyWeightControllerException() {
    }
    
    public SupplyWeightControllerException(String message) {
        super(message);
    }
    
    public SupplyWeightControllerException(Throwable cause) {
        super(cause);
    }
    
    public SupplyWeightControllerException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public SupplyWeightControllerException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
}
