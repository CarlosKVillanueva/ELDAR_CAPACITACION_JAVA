package domain;

public class Persona {

    public final void imprimir() {
        System.out.println("Metodo Imprimir");
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
