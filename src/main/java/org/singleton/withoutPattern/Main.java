package org.singleton.withoutPattern;

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = new Configuracao("Configuração 1");
        Configuracao config2 = new Configuracao("Configuração 2");

        System.out.println(config1.getConfiguracao());
        System.out.println(config2.getConfiguracao());
    }
}
