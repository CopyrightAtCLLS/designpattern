package chainofresponsibility.logger;

import chainofresponsibility.AbstractLogger;

public class INFOLogger extends AbstractLogger {
    public INFOLogger(int level) {
        this.level = level;
    }

    @Override
    protected void log(String message) {
        System.out.println("INFO => " + message);
    }
}
