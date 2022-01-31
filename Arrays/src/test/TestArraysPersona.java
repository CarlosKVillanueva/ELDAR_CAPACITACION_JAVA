package test;

import domain.Persona;

public class TestArraysPersona {

    public static void main(String[] args) {
        Persona personas[] = new Persona[5];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona("" + i);
        }

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}
