package modelo.datos;

import java.io.Serializable;
import java.util.*;

public class Cliente implements Serializable {
    private String nif;
    private String dirrecccion;
    private String email;
    private Date fecha_creacion;
    private Tarifa tarifa;
    private static final long serialVersionUID = 42L;

    // CONSTRUCTOR
    public Cliente(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa){
        this.nif = nif;
        this.dirrecccion = dirrecccion;
        this.email = email;
        this.fecha_creacion = fecha_creacion;
        this.tarifa = tarifa;
    }
    // GETTERS y SETTERS

    public String getNif() {
        return nif;
    }

    public String getDirrecccion() {
        return dirrecccion;
    }

    public String getEmail() {
        return email;
    }

    public Date getFecha() {
        return fecha_creacion;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

}
