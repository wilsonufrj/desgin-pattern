package org.chainOfResponsability.withPattern;

public class DebugLogger extends Logger {
    @Override
    public void logMessage(String message, String level) {
        if (level.equalsIgnoreCase("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else {
            super.logMessage(message, level);
        }
    }
}
