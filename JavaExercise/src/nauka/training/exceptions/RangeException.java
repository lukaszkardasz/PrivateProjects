package nauka.training.exceptions;

public class RangeException extends Exception {
    private String msg = "";

    public RangeException() {
        msg = "Don't try get value outer memory";
    }

    public RangeException(String message) {
        super(message);
    }


    @Override
    public String toString() {
        return msg + super.toString();
    }
}
