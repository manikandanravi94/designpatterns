package com.mani.behavioral.cor;

public abstract class Logger {

    public static int info=1;

    public static int debug=2;

    public static int error=3;

    private Logger logger;

    public Logger(Logger logger){
        this.logger=logger;
    }

    public void log(int level,String message){
        if(this.logger!=null){
            logger.log(level, message);
        }
    }
}
