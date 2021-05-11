package chainofresponsibility.logger;

import chainofresponsibility.AbstractLogger;

public class DEBUGLogger extends AbstractLogger {
    public DEBUGLogger(int level) {
        this.level = level;
    }

    @Override
    protected void log(String message) {
        System.out.println("DEBUG => " + message);
    }
}
