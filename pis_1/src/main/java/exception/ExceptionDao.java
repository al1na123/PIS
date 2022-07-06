package exception;

public class ExceptionDao extends Exception {
    public ExceptionDao(){
        super("There are exceptions with DAOs");
    }

    public ExceptionDao(String message){
        super(message);
    }

    public ExceptionDao(String message, Throwable cause){
        super(message,cause);
    }
}