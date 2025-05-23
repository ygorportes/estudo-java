package com.ygorportes.estudojava.estruturascondicionais;

public class Aula05_EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 = categoria infantil
        // idade >= 15 && idade < 18 = categoria juvenil
        // idade >= 18 = categoria adulto
        int idade = 18;
        String categoria;

        if (idade < 15) {
            categoria =  "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
