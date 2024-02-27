package com.mani.behavioral.cor;

public class InfoLogger extends Logger{
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int level, String message) {
        if(level==1){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
