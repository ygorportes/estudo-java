package com.ygorportes.estudojava.estruturasderepeticao;

public class Aula06_EstruturasDeRepeticaoExercicio02 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um determinado valor. Por exemplo, 50
        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) { // Se i for maior que 25, o laço é interrompido.
                break;
            }
            System.out.println(i);
        }
    }
}
