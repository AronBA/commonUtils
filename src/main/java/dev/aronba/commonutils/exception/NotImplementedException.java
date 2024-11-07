package dev.aronba.commonutils.exception;

/**
 * Exception thrown to indicate that a method has not been implemented.
 */
public class NotImplementedException extends RuntimeException {

    /**
     * Constructs a new NotImplementedException with a default message.
     */
    public NotImplementedException() {
        super("Not implemented ¯\\_(ツ)_/¯");
    }
}