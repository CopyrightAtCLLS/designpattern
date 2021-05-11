package chainofresponsibility;

import chainofresponsibility.logger.DEBUGLogger;
import chainofresponsibility.logger.ERRORLogger;
import chainofresponsibility.logger.INFOLogger;

public class Main {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ERRORLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DEBUGLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new INFOLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO, "INFO level");
        System.out.println("---------------------------");
        logger.logMessage(AbstractLogger.DEBUG, "DEBUG level");
        System.out.println("---------------------------");
        logger.logMessage(AbstractLogger.ERROR, "ERROR level");
    }
}
