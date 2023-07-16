package com.pault.example;

public class AgeLessThanZeroException extends Exception {

    public AgeLessThanZeroException(String msg) {
        super(msg);
    }

    public AgeLessThanZeroException() {}

    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }

    public AgeLessThanZeroException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
