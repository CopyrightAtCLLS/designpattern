package chainofresponsibility.logger;

import chainofresponsibility.AbstractLogger;

public class ERRORLogger extends AbstractLogger {
    public ERRORLogger(int level) {
        this.level = level;
    }

    @Override
    protected void log(String message) {
        System.out.println("ERROR => " + message);
    }
}
