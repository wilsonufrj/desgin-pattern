package org.chainOfResponsability.withPattern;

public class InfoLogger extends Logger{
    @Override
    public void logMessage(String message, String level) {
        if (level.equalsIgnoreCase("INFO")) {
            System.out.println("INFO: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
