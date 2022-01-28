package pasoporreferencia;

import persona.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre = "Juan";
        System.out.println("Nombre: " + persona1.nombre);
        persona1.apellido = "Perez";
        System.out.println("Apellido: " + persona1.apellido);
        
        Persona persona2 = cambiaValor(persona1);
        
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Apellido: " + persona2.apellido);
        
    }
    
    public static Persona cambiaValor(Persona persona) {
        persona.nombre = "Kaio";
        persona.apellido = "Villanueva";
        return persona;
    }
    
}
