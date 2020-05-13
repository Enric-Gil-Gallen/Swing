package modelo.datos;

import java.io.Serializable;
import java.util.*;

public class Cliente implements Serializable {
    private String nif;
    private String dirrecccion;
    private String email;
    private Date fecha_creacion;
    private Tarifa tarifa;
    private String nombre;
    private String cp;
    private String direccion;
    private String poblacion;
    private static final long serialVersionUID = 42L;

    // CONSTRUCTOR
    public Cliente(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa, String nombre, String cp, String direccion, String poblacion){
        this.nif = nif;
        this.dirrecccion = dirrecccion;
        this.email = email;
        this.fecha_creacion = fecha_creacion;
        this.tarifa = tarifa;
        this.nombre = nombre;
        this.cp = cp;
        this.direccion = direccion;
        this.poblacion = poblacion;
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

    public String getNombre(){ return nombre;}

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

}
