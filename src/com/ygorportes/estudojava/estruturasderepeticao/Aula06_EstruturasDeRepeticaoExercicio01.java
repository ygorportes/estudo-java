package com.ygorportes.estudojava.estruturasderepeticao;

public class Aula06_EstruturasDeRepeticaoExercicio01 {
    public static void main(String[] args) {
        // imprima todos os números pares até 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
