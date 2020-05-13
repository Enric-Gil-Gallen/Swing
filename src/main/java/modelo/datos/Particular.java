package modelo.datos;

import java.util.Date;

public class Particular extends Cliente {
    private String apellidos;

    //CONSTRUCTOR
    public Particular(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa, String apellidos, int codijoPostal, String provincia, String nombre, String cp, String direccion, String poblacion) {
        super(nif, dirrecccion, email, fecha_creacion, tarifa,nombre, cp, direccion, poblacion);
        this.apellidos = apellidos;
    }


    public String getApellidos() {
        return apellidos;
    }

}
