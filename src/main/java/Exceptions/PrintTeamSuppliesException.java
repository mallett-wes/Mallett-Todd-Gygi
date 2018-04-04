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
public class PrintTeamSuppliesException extends RuntimeException{
    public PrintTeamSuppliesException() {
    }
    
    public PrintTeamSuppliesException(String message) {
        super(message);
    }
    
    public PrintTeamSuppliesException(Throwable cause) {
        super(cause);
    }
    
    public PrintTeamSuppliesException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public PrintTeamSuppliesException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
}
