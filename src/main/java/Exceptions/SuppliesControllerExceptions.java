/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author wesmallett
 */
public class SuppliesControllerExceptions extends RuntimeException{
    
    public SuppliesControllerExceptions() {
    }
    
    public SuppliesControllerExceptions(String message) {
        super(message);
    }
    
    public SuppliesControllerExceptions(Throwable cause) {
        super(cause);
    }
    
    public SuppliesControllerExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    public SuppliesControllerExceptions(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
}
