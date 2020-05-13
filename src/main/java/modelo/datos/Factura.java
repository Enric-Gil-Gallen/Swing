package modelo.datos;

import java.io.Serializable;
import java.util.*;

public class Factura implements Serializable {
    double importe;
    Cliente cliente;
    Date fechaE;
    Tarifa tarifa;
    UUID id;
    int periodo;
    private static final long serialVersionUID = 42L;

    public Factura(double importe, Cliente cliente, Date fechaE, Tarifa tarifa, int periodo) {
        this.importe = importe;
        this.cliente = cliente;
        this.fechaE = fechaE;
        this.tarifa = tarifa;
        this.periodo = periodo;
        id = UUID.randomUUID();
    }


    public Factura(Cliente cliente, Date fechaE, Tarifa tarifa, int periodo, HashSet<Llamada> llamadas) {
        this.cliente = cliente;
        this.fechaE = fechaE;
        this.tarifa = tarifa;
        this.periodo = periodo;
        //importe = calcularimporte(tarifa, llamadas);
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

    public Date getFecha() {
        return fechaE;
    }

    public Tarifa getTarifa(){ return tarifa;}

    public Integer getPeriodo(){ return periodo;}
}
