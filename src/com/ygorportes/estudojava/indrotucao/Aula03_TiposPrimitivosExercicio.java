package com.ygorportes.estudojava.indrotucao;

import java.util.Date;

/*
Prática

Crie variáveis para os campos descritos abaixo entre < > e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03_TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Ygor";
        String endereco = "Rua Tal";
        double salario = 1500.75;
        String data = "01/01/2020";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data);
    }
}
