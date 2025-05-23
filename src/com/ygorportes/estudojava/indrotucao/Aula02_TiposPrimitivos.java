package com.ygorportes.estudojava.indrotucao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

         /* Casting: Forçar uma variavel a se tornar outra
            long numeroGrande = (long) 155.23;
            Vai imprimir só 155 porque o long não suporte número com decimal
            Tipo primitivo = Guarda um valor simples
            String NÃO é primitivo. É uma classe.
        */
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Fulano";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
