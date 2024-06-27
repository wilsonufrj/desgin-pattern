package org.chainOfResponsability.withoutPattern;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("Este é um log de informação", "INFO");
        logger.log("Este é um log de depuração", "DEBUG");
        logger.log("Este é um log de erro", "ERROR");
    }
}
