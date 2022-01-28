package test;


import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 5000, false);
        
        persona.setNombre("Carlos Villanueva");
//        System.out.println("Nombre:" + persona.getNombre());
//        System.out.println("Sueldo: " + persona.getSueldo());
//        System.out.println("Eliminado: " + persona.isEliminado());
        System.out.println(persona);
        
        persona.setNombre("Juan Perez");
        persona.setSueldo(5500);
        persona.setEliminado(true);
        
//        System.out.println("Nombre:" + persona.getNombre());
//        System.out.println("Sueldo: " + persona.getSueldo());
//        System.out.println("Eliminado: " + persona.isEliminado());
        System.out.println(persona);
    }
}
