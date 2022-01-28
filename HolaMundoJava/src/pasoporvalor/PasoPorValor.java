package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        
        cambioValor(x); 
        
        System.out.println(x);
    }
    
   //Paso por Valor
    public static void cambioValor(int arg1){
        System.out.println(arg1);
        arg1 = 15;
        
    } 


}

