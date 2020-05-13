package modelo.datos;

import java.util.Date;

public class Empresa extends Cliente {
    public Empresa(String nif, String dirrecccion, String email, Date fecha_creacion, Tarifa tarifa) {
        super(nif, dirrecccion, email, fecha_creacion, tarifa);
    }

}
