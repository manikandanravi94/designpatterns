package com.mani.behavioral.cor;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if(level==3){
            System.out.println("Error message : "+message);
        }else{
            super.log(level, message);
        }
    }
}
