package org.factory.withPattern;

public class Main {
    public static void main(String[] args) {
        String tipoVeiculo1 = "carro";
        String tipoVeiculo2 = "caminhao";

        Veiculo veiculo = VeiculoFactory.criarVeiculo(tipoVeiculo1);
        veiculo.drive();

        Veiculo veiculo2 = VeiculoFactory.criarVeiculo(tipoVeiculo2);
        veiculo2.drive();
    }
}
