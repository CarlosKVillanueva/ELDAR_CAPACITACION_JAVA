package ar.com.eldar.mundopc.test;

import ar.com.eldar.mundopc.*;

public class TestComputadora {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Teclado", "Logitech");
        Teclado tecladoRazer = new Teclado("Teclado", "Razer");
        Mouse mouse = new Mouse("Mouse", "Logitech");
        Mouse mouseRazer = new Mouse("Mouse", "Razer");
        Monitor monitor = new Monitor("Samsung", 27);
        Monitor monitorRazer = new Monitor("Razer", 27);

        Computadora computadora = new Computadora("Alienware", monitor, teclado, mouse);
        Computadora computadoraRazer = new Computadora("Alienware", monitorRazer, tecladoRazer, mouseRazer);

        OrdenCompra ordenCompra = new OrdenCompra();

        ordenCompra.agregarComputadora(computadora);
        ordenCompra.agregarComputadora(computadoraRazer);

        ordenCompra.mostrarOrden();
    }
}
