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
public class RiverSceneControllerException extends RuntimeException{
    public RiverSceneControllerException() {
    }
    
    public RiverSceneControllerException(String message) {
        super(message);
    }
    
    public RiverSceneControllerException(Throwable cause) {
        super(cause);
    }
    
    public RiverSceneControllerException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public RiverSceneControllerException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
    
}
