package org.sparky.model.exceptions;

/**
 * Exception representing an invalid key, provides a reason
 *
 * Created by lloyd on 20/10/2015.
 */
public class InvalidKeyException extends Exception {
    public InvalidKeyException(String reason){
        super(reason);
    }
}
