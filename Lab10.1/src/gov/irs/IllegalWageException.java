package gov.irs;

/*
This is a custom exception class and it is checked
 */

public class IllegalWageException extends Exception{
    public IllegalWageException() {
    }

    public IllegalWageException(String message) {
        super(message);
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }

}
