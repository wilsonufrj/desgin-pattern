package org.chainOfResponsability.withPattern;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message, String level) {
        if (this.nextLogger != null) {
            this.nextLogger.logMessage(message, level);
        }
    }
}
