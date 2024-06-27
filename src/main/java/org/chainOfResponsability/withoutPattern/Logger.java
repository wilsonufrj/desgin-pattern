package org.chainOfResponsability.withoutPattern;

public class Logger {
    public void log(String message, String level) {
        if (level.equalsIgnoreCase("INFO")) {
            System.out.println("INFO: " + message);
        } else if (level.equalsIgnoreCase("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else if (level.equalsIgnoreCase("ERROR")) {
            System.out.println("ERROR: " + message);
        } else {
            throw new IllegalArgumentException("Nível de log desconhecido");
        }
    }
}
