package modelo.datos;

import modelo.ImplementacionModelo;

import java.io.Serializable;
import java.util.*;

public class Factura implements Serializable {
    private ImplementacionModelo modelo;
    double importe;
    Cliente cliente;
    String fechaE;
    Tarifa tarifa;
    UUID id;
    int periodo;
    private static final long serialVersionUID = 42L;

    public Factura(Cliente cliente, String fechaE, Tarifa tarifa, int periodo, double importe) {
        this.cliente = cliente;
        this.fechaE = fechaE;
        this.tarifa = tarifa;
        this.periodo = periodo;
        this.importe = importe;
        id = UUID.randomUUID();

    }


    public Cliente getCliente() {
        return cliente;
    }

    public UUID getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public String getFecha() {
        return fechaE;
    }

    public Tarifa getTarifa(){ return tarifa;}

    public Integer getPeriodo(){ return periodo;}

    @Override
    public String toString() {
        return "Factura de importe=" + importe +
                ", cliente=" + cliente +
                "desde fecha " + fechaE.toString() +
                "con la tarifa=" + tarifa +
                "en el periodo=" + periodo +
                ", id=" + id +
                '}';
    }
}
