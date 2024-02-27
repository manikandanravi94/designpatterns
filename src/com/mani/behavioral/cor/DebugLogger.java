package com.mani.behavioral.cor;

public class DebugLogger extends Logger {
    public DebugLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if (level == 2) {
            System.out.println("Debug message : " + message);
        } else {
            super.log(level, message);
        }
    }
}
