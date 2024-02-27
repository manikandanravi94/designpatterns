package com.mani.behavioral.cor;


/*
this pattern can be used in places where propogation to be placed in sequence. important thing to note here is it should have a common handler that has the provision
to move to the next concrete handler. if the case is valid if not request to be stopped not to propagate to the next level
 */
public class LoggerImpl {

    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(Logger.info, "info log");
        logger.log(Logger.debug, "debug log");
        logger.log(Logger.error, "error log");
    }
}
