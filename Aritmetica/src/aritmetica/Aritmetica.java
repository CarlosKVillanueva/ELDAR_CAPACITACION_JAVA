package aritmetica;

public class Aritmetica {
    
    int a; 
    int b;
    
    //Conmstructor Vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    //Sobrecarga de Constructores
    public Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
    }
    
    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    //Metodo con Argumentos
    public int sumarConArgumentos(int arg1, int arg2) {
        return arg1 + arg2;
    }
    
    
    
    
    
    
}
