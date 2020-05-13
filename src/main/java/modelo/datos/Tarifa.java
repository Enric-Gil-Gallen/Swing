package modelo.datos;

import java.io.Serializable;

public class Tarifa  implements Serializable {

    private double precio;
    private String id;
    private static final long serialVersionUID = 42L;

    public Tarifa(double tarifa){
        this.precio = tarifa;
    }

    public Tarifa() {

    }

    public double getTarifa() {
        return precio;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
