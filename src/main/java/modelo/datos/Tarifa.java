package modelo.datos;

import java.io.Serializable;

public abstract class Tarifa  implements Serializable {

    private static final long serialVersionUID = 42L;
    private double precio ;
    private String ip ;

    public Tarifa(double precio, String ip) {
        this.precio = precio;
        this.ip = ip;
    }

    public double getPrecio(){
        return precio;
    }

    public String getIp() {
        return ip;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
