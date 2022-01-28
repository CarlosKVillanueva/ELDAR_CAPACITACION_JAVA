package domain;

//import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    //private LocalDate fechaRegistro;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("ID Cliente: ").append(idCliente);
        sb.append(" | Fecha Registrio: ").append(fechaRegistro);
        sb.append(" | VIP: ").append(vip);
        sb.append(" | ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
