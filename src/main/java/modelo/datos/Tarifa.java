package modelo.datos;

import java.io.Serializable;

public abstract class Tarifa  implements Serializable {

    private Cliente cliente;
    private static final long serialVersionUID = 42L;
    private double precio = 0.15;
    private Integer tarifaActual = 0;

    public Tarifa(Cliente cliente){
        this.cliente = cliente;
    }

    public double getPrecio(){
        return precio;
    }

    public Integer getTarifaActual() {
        return tarifaActual;
    }

}
