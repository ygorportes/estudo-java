package com.ygorportes.estudojava.estruturasderepeticao;

public class Aula06_EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // continue;
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000
        double valorCarro = 40000;
        for (int i = (int) valorCarro; i >= 1; i--) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Em até " + i + "x de R$ " + String.format("%.2f",valorParcela));
        }

    }
}
