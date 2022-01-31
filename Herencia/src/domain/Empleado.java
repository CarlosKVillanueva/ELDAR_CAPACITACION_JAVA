package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(double sueldo, String nombre, char genero, int edad, String direccion) {
        //super(nombre, genero, edad, direccion);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado: {");
        sb.append("ID Empleado: ").append(this.idEmpleado);
        sb.append(" | Sueldo: ").append(this.sueldo);
        sb.append(" | ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
