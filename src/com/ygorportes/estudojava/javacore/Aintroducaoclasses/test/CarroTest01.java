package com.ygorportes.estudojava.javacore.Aintroducaoclasses.test;

import com.ygorportes.estudojava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagem";
        carro1.modelo = "Gol";
        carro1.ano = 2010;

        // carro1 = carro2; Referencia de Objetos. Só pode fazer isso quando tem objetos do mesmo tipo

        carro2.marca = "Chevrolet";
        carro2.modelo = "Opala";
        carro2.ano = 1992;

        System.out.println("Carro 1:");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2:");
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }

}
