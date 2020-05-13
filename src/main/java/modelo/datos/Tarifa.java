package modelo.datos;

import java.io.Serializable;

public class Tarifa  implements Serializable {

    private double tarifa;
    private static final long serialVersionUID = 42L;

    public Tarifa(double tarifa){
        this.tarifa = tarifa;
    }

    public Tarifa() {

    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
