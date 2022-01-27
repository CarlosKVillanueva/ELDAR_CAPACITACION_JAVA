package caja;


public class pruebaCajaVolumen {
    public static void main(String[] args) {
        Caja caja = new Caja(3, 2, 6);
        
        System.out.println("El Volumen de la caja es de: " + caja.calcularVolumen() + " m3");
        
        
    }
}
