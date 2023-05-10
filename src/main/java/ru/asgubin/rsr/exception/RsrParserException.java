package ru.asgubin.rsr.exception;

public class RsrParserException extends Exception {
    public RsrParserException() {
        super();
    }

    public RsrParserException(String message) {
        super(message);
    }

    public RsrParserException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
