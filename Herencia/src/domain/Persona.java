package domain;

public class Persona {

    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append(" | Nombre: ").append(nombre);
        sb.append(" | Genero: ").append(genero);
        sb.append(" | Edad: ").append(edad);
        sb.append(" | Direccion: ").append(direccion);
        sb.append(" | ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
