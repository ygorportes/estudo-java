package com.ygorportes.estudojava.arrays;

public class Aula07_Arrays02 {
    public static void main(String[] args) {
        /*
         Valores de inicialização padrão:
         byte, short, long, float, double = 0
         char = '\u0000' -> ''
         boolean = false
         String = null
         */
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Pedro";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
