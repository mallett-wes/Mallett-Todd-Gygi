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
public class CharacterControllerException extends RuntimeException{
    public CharacterControllerException() {
    }
    
    public CharacterControllerException(String message) {
        super(message);
    }
    
    public CharacterControllerException(Throwable cause) {
        super(cause);
    }
    
    public CharacterControllerException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public CharacterControllerException(String message, Throwable cause, Boolean enableSuppression, Boolean writableStacktrace) {
        super(message, cause, enableSuppression, writableStacktrace);
    }
}
