package ar.com.eldar.ventas;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Orden {

    DecimalFormat df = new DecimalFormat("#.##");

    private static final int MAX_PRODUCTOS = 10;
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos <= MAX_PRODUCTOS) {
            productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el número máximo de productos posibles + (" + MAX_PRODUCTOS + ")");
        }
    }

    public double calcularTotal() {
        double totalOrden = 0;

        for (int i = 0; i < this.contadorProductos; i++) {
            totalOrden += productos[i].getPrecio();
        }

        return totalOrden;
    }

    public void mostrarOrden() {
        System.out.println("ID ORDEN: " + this.idOrden);
        System.out.println("*** Productos Comprados ***");
        System.out.println("ID\tDescripcion\tPrecio\t");
        System.out.println("-------------------------------");

        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }

        df.setRoundingMode(RoundingMode.FLOOR);
        String totalOrden = df.format(calcularTotal());

        System.out.println("\nTotal Orden: \t\t$" + totalOrden + "\n\n");
        System.out.println("*** Gracias por su compra ***");
    }

}
