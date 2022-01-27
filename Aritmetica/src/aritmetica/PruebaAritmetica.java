
package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        
        System.out.println("A: " + aritmetica.a);
        System.out.println("B: " + aritmetica.b);
        
        
        Aritmetica aritmeticaB = new Aritmetica(5,8);
        System.out.println("A: " + aritmeticaB.a);
        System.out.println("B: " + aritmeticaB.b);
        
        
        System.out.println(aritmeticaB.sumarConArgumentos(10, 15));
    }
}
