package org.factory.withoutPattern;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = null;

        String tipoVeiculo = "carro";

        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            veiculo = new Carro();
        } else if (tipoVeiculo.equalsIgnoreCase("caminhao")) {
            veiculo = new Caminhao();
        } else {
            throw new IllegalArgumentException("Tipo de veículo desconhecido");
        }

        veiculo.drive();
    }
}
