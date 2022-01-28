package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(5000, "Carlos", 'M', 39, "Av. Siempre Viva 2345");
        System.out.println("empleado = " + empleado);
        Cliente cliente = new Cliente(new Date(), true, "Pedro", 'M', 39, "Av. Siempre Viva 1234");
        System.out.println("Cliente = " + cliente);
    }
}
