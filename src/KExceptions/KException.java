package KExceptions;

public class KException extends Exception {

    private String message = null;

    public KException( String message ) {

        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
