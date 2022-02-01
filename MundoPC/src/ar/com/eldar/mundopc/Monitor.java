package ar.com.eldar.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    public Monitor(String marca, double tamanio) {
        this.idMonitor = ++Monitor.contadorMonitor;
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor: ");
        sb.append("ID: ").append(idMonitor);
        sb.append(" | Marca: ").append(marca);
        sb.append(" | Tamaño: ").append(tamanio);
        return sb.toString();
    }

}
