package domain;

//public class Empleado extends Persona {
//  No se puede heredar de una clase que sea final
//}
public class Empleado extends Persona {
    //No permite modificar el metodo en la clase Empleado, ya que el metodo imprimir() de la clase Persona es final
    //con esto se evita que clases hijas, puedan modificar el metodo heredado de la superclase

//    public void imprimir() {
//        System.out.println("Imp. desde Clase Hija");
//    }
}
