package test;

import ar.com.eldar.Utileria;
import static ar.com.eldar.Utileria.imprimir;

public class TestUtileria {

    public static void main(String[] args) {
        Utileria.imprimir("Import Clase Utileria");
        imprimir("Import Metodo Static Clase Utileria");
        ar.com.eldar.Utileria.imprimir("Nombre completamente calificado");
    }
}
