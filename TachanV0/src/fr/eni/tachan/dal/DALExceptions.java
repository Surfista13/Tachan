package fr.eni.tachan.dal;

public class DALExceptions extends Exception {

    public DALExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return "Probleme sur la DAL: " + super.getMessage();
    }
}
