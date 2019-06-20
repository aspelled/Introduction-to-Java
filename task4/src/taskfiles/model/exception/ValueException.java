package taskfiles.model.exception;

public class ValueException extends Exception {
    public ValueException () { }
    public ValueException (String message) {
        super(message);
    }
    public ValueException (String message, Throwable reason) {
        super(message, reason);
    }
}
