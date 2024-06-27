package org.singleton.withPattern;

public class Configuracao {
    private static Configuracao instanciaUnica;
    private String configuracao;

    private Configuracao() {
        this.configuracao = "Configuração Padrão";
    }

    public static synchronized Configuracao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}
