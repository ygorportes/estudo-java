package com.ygorportes.estudojava.indrotucao;

public class Aula04_Operadores {
    public static void main(String[] args) {
        //Operadores matemáticos (+, -, /, *)
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //Resto da divisão (%) - Bom para saber se o resultado é par ou impar. Se da = 0 o num é par
        int resto = 20 % 2;
        System.out.println(resto);

        //Operadores booleanos (<, >, <=, >=, ==, !=)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualQueDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteQueDez = " + isDezDiferenteDez);

        //Operadores lógicos (&& (AND), || (OR), ! (NOT))
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta = " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta = " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPupanca > valorPlayStation;
        System.out.println("isPlaystationCincoCompravel = " + isPlaystationCincoCompravel);

        //Operadores de atribuição (=, +=, -=, *=, /=, %=)
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println("bonus = " + bonus);
    }
}
