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
public class GameControllerException extends RuntimeException{
    public GameControllerException() {
    }
    
    public GameControllerException(String message) {
        super(message);
    }
    
    public GameControllerException(Throwable cause) {
        super(cause);
    }
    
    public GameControllerException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public GameControllerException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
    
}
