
package caja;


public class Caja {

    private int ancho;
    private int alto;
    private int profundo;

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public Caja() {
        System.out.println("Constructor Vacio");
    }
    
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }
}
