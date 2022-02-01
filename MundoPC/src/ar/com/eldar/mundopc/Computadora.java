package ar.com.eldar.mundopc;

public class Computadora {

    private final int idComputadora;
    private static int contadorComputadora;
    private String marca;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String marca, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.marca = marca;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPC: ");
        sb.append("\tID: ").append(idComputadora);
        sb.append(" | Marca: ").append(marca);
        sb.append("\n").append(monitor);
        sb.append("\n").append(teclado);
        sb.append("\n").append(mouse);
        return sb.toString();
    }

}
