package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println(edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 10;
        edades[1][1] = 12;
        edades[2][0] = 15;
        edades[2][1] = 18;

//        System.out.println(edades[0][0]);
//        System.out.println(edades[0][1]);
//        System.out.println(edades[1][0]);
//        System.out.println(edades[1][1]);
//        System.out.println(edades[2][0]);
//        System.out.println(edades[2][1]);
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("Edades: " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

        String frutas[][] = {{"Naranja", "Limon", "Pomelo"}, {"Frutillas", "Manzana", "Pera", "Kiwi"}};

        imprimir(frutas);

        //Persona personas[][] = new Persona[2][3];
        Persona personas[][] = {{new Persona("Kaio"), new Persona("Pedro")}, {new Persona("Facu"), new Persona("Anto"), new Persona("Diego")}};

        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.println("Matriz: " + f + "-" + c + ": " + matriz[f][c]);
            }
        }
    }
}
