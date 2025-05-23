package com.ygorportes.estudojava.estruturascondicionais;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Comprar se salario > 5000
        double salario = 3000;
//        String mensagemComprar = "Eu vou comprar um PS5";
//        String mensagemNaoComprar = "Ainda não tenho condições, mas vou ter";
//        String resultado = salario > 5000 ? mensagemComprar : mensagemNaoComprar;
        String resultado = salario > 5000 ? "Eu vou comprar um PS5" : "Ainda não tenho condições, mas vou ter";

        System.out.println(resultado);


    }
}
