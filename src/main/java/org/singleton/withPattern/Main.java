package org.singleton.withPattern;

public class Main {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        config1.setConfiguracao("Configuração Atualizada");

        System.out.println(config1.getConfiguracao());
        System.out.println(config2.getConfiguracao());
    }
}
