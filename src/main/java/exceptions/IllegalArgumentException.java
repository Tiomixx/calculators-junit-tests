package exceptions;

public class IllegalArgumentException extends Exception {

    private String errorMessage;

    public IllegalArgumentException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
