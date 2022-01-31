package ar.com.eldar.ventas.test;

import ar.com.eldar.ventas.*;

public class VentasTest {

    public static void main(String[] args) {

        Producto productos[] = {new Producto("Iphone 12", 1199.99), new Producto("Iphone 13", 1699.99),
            new Producto("MacBook Air", 2599.99), new Producto("AirPods Pro", 399.99),
            new Producto("AirPods Max", 899.99)};

        Orden ordenCompra = new Orden();

        for (int i = 0; i < productos.length; i++) {
            ordenCompra.agregarProducto(productos[i]);
        }

        ordenCompra.mostrarOrden();

    }
}
