package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final Persona persona = new Persona();
        //Un Objeto de tipo final no se le puede asignar una nueva referencia a otro objeto
        //persona = new Persona();

        //Pero si se le puede modificar un atributo a ese objeto final
        persona.setNombre("Carlos");
        System.out.println("persona = " + persona.getNombre());
        persona.setNombre("Pedro");
        System.out.println("persona = " + persona.getNombre());

    }
}
