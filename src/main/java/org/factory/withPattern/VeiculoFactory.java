package org.factory.withPattern;

public class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipoVeiculo) {
        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            return new Carro();
        } else if (tipoVeiculo.equalsIgnoreCase("caminhao")) {
            return new Caminhao();
        } else {
            throw new IllegalArgumentException("Tipo de veículo desconhecido");
        }
    }

}
