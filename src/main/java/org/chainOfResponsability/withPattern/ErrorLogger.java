package org.chainOfResponsability.withPattern;

public class ErrorLogger extends Logger{
    @Override
    public void logMessage(String message, String level) {
        if (level.equalsIgnoreCase("ERROR")) {
            System.out.println("ERROR: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
