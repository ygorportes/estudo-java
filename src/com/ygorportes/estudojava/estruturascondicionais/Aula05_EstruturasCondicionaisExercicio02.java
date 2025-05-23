package com.ygorportes.estudojava.estruturascondicionais;

public class Aula05_EstruturasCondicionaisExercicio02 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        /*
            Outra forma mais simples de resolver o exercício, levando em conta que o case não para sem o break.
            switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
         */
    }
}
