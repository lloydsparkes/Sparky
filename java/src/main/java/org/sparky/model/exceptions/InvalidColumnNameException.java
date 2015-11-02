package org.sparky.model.exceptions;

/**
 * Created by lloyd on 26/10/2015.
 */
public class InvalidColumnNameException extends InvalidKeyException {
    public InvalidColumnNameException(String reason){
        super(reason);
    }
}