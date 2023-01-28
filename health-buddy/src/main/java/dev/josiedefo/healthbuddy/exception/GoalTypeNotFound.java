package dev.josiedefo.healthbuddy.exception;

public class GoalTypeNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public GoalTypeNotFound(String msg) {
        super(msg);
    }
}
