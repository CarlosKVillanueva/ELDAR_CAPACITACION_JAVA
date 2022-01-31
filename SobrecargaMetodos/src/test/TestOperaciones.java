package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {

        System.out.println(Operaciones.sumar(3, 5));
        System.out.println(Operaciones.sumar(3.5, 5.4));
        System.out.println(Operaciones.sumar(3, 5L));

    }
}
