package modelo.datos;

import java.util.Date;

public class Empresa extends Cliente {
    public Empresa(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa, String nombre, String cp, String direccion, String poblacion) {
        super(nif, dirrecccion, email, fecha_creacion, tarifa,nombre, cp, direccion, poblacion);
    }

}
