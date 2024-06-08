package br.com.cmts.core.exception.enuns;

public class NotFoundException extends Exception{
    private String code;

    public NotFoundException(String message, String code) {
        super(message);
        this.code = code;
    }
}
