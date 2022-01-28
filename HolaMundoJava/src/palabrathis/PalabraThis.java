package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", "Villanueva");
        
        System.out.println(persona);
        System.out.println(persona.nombre);
        System.out.println(persona.apellido);
    }
}


class Persona{
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
//        super();
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Constructor: " + this);
        
        new Imprimir().imprimir(this);
    }  
    
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde Imprimir(): " + persona);
        System.out.println("Impresion de this: " + this);
    }
}
