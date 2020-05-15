package modelo.datos;

import java.io.Serializable;
import java.util.*;

public class Cliente implements Serializable {
    private String nif;

    private String email;
    private Date fecha_creacion;
    private Tarifa tarifa;
    private String nombre;
    private String cp;
    private String direccion;
    private String poblacion;
    private String provincia;
    private static final long serialVersionUID = 42L;

    // CONSTRUCTOR
    public Cliente(String nif, String nombre, String email, Date fecha_creacion, Tarifa tarifa, String cp, String direccion, String poblacion,String provincia){
        this.nif = nif;
        this.email = email;
        this.fecha_creacion = fecha_creacion;
        this.tarifa = tarifa;
        this.nombre = nombre;
        this.cp = cp;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia=provincia;
    }
    // GETTERS y SETTERS

    public String getNif() {
        return nif;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


    @Override
    public String toString() {
        return "Cliente:" +
                "ID='" + nif + '\'' +
                ", email='" + email + '\'' +
                ", tarifa=" + tarifa +
                ", nombre='" + nombre + '\'' +
                ", cp='" + cp + '\'' +
                ", direccion='" + direccion + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia ;
    }
}
