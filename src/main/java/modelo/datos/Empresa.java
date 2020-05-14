package modelo.datos;

import java.util.Date;

public class Empresa extends Cliente {
    public Empresa(String cif,String nombre,String email, Date fecha_creacion, Tarifa tarifa,  String cp, String direccion, String poblacion,String provincia) {
        super(cif, nombre,email, fecha_creacion, tarifa, direccion,cp, poblacion, provincia);
    }
}
