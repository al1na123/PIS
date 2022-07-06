package exception;

public class UnimplementedDB extends Exception {
    public UnimplementedDB() {
        super("Unimplemented DB");
    }

    public UnimplementedDB(String message) {
        super(message);
    }

    public UnimplementedDB(String message, Throwable cause) {
        super(message, cause);
    }
}