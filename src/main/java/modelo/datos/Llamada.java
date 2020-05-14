package modelo.datos;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;

public class Llamada  implements Serializable {
    private static final long serialVersionUID = 42L;
    int numeroTelefono;
    Integer horaInicio;
    Integer horaFinal;
    int duración;
    Cliente cliente;
    private Integer dia;

    public Llamada(int numeroTelefono, int duración, Cliente cliente, Integer horaFinal, Integer horaInicio) {
        this.numeroTelefono = numeroTelefono;
        this.duración = duración;
        this.cliente= cliente;
        this.horaFinal = horaFinal;
        this.horaInicio = horaInicio;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public int getDuración() {
        return duración;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Integer getDia() {
        return dia;
    }
}
