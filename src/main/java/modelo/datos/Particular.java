package modelo.datos;

import java.util.Date;

public class Particular extends Cliente {
    private String apellidos;

    //CONSTRUCTOR
    public Particular(String nif, String nombre, String apellidos,String email, Date fecha_creacion, Tarifa tarifa, String direccion, String cp,String poblacion, String provincia) {
        super(nif, nombre,email, fecha_creacion, tarifa, direccion,cp, poblacion, provincia);
        this.apellidos = apellidos;
    }


    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return super.toString()+ "apellidos='" + apellidos + '\'' + '}';
    }
}
