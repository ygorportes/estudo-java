package com.ygorportes.estudojava.estruturasderepeticao;

public class Aula06_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while
        int contador = 0;
        while(contador < 10) {
            System.out.println(++contador);
        }

        // do-while
        contador = 0;
        do {
            System.out.println("Dentro do do-while: " + ++contador);
        }while (contador < 10);

        // for
        for(int i=0; i < 10; i++){
            System.out.println("For: " + i);
        }
    }
}
