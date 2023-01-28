package dev.josiedefo.healthbuddy.exception;

public class GoalLogNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public GoalLogNotFound(String msg) {
        super(msg);
    }
}
