package modelo.datos;

import java.util.Date;

public class Particular extends Cliente {
    private String apellidos;
    private int codijoPostal;
    private String provincia;
    private String poblacion;

    //CONSTRUCTOR
    public Particular(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa, String apellidos, int codijoPostal, String provincia, String poblacion) {
        super(nif, dirrecccion, email, fecha_creacion, tarifa);
        this.apellidos = apellidos;
        this.codijoPostal = codijoPostal;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }


    public String getApellidos() {
        return apellidos;
    }

    public int getCodijoPostal() {
        return codijoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }
}
