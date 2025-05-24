package com.ygorportes.estudojava.estruturasderepeticao;

public class Aula06_EstruturasDeRepeticaoExercicio03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000
        double valorCarro = 40000;

        /*
        for (int i = 1; i < valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Em até " + i + "x de R$ " + String.format("%.2f",valorParcela) + " sem juros.");
        }
         */

        // Decidi alterar o desafio, aplicando 5% de juros no valor total do carro caso seja parcelado em mais de 12x
        // mostrando apenas 5 condições de pagamento.
        for (int numeroParcela = 1; numeroParcela <= 48; numeroParcela++) {
            if (numeroParcela == 1 || numeroParcela == 12 || numeroParcela == 24 || numeroParcela == 36 || numeroParcela == 48) {
                double valorParcela;

                if (numeroParcela <= 12) {
                    valorParcela = valorCarro / numeroParcela;
                    System.out.println(
                            "Em até " + numeroParcela + "x de R$ " + String.format("%.2f", valorParcela) + " sem juros."
                    );
                } else {
                    double totalComJuros = valorCarro * 1.05;
                    valorParcela = totalComJuros / numeroParcela;

                    System.out.println(
                            "Em até " + numeroParcela + "x de R$ " + String.format("%.2f", valorParcela) + " com juros."
                    );
                }
            }
        }
    }
}
