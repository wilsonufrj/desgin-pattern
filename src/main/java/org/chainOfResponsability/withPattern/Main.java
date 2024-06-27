package org.chainOfResponsability.withPattern;

public class Main {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger debugLogger = new DebugLogger();
        Logger infoLogger = new InfoLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage("Este é um log de informação", "INFO");
        loggerChain.logMessage("Este é um log de depuração", "DEBUG");
        loggerChain.logMessage("Este é um log de erro", "ERROR");
    }

}
