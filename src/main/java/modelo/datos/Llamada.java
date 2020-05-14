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

    public Llamada(int numeroTelefono, Date horadiaLlamada, int duración, Cliente cliente) {
        this.numeroTelefono = numeroTelefono;
        this.horadiaLlamada = horadiaLlamada;
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

    @Override
    public String toString() {
        return "Llamada:" +
                "numeroTelefono=" + numeroTelefono +
                ", horadiaLlamada=" + horadiaLlamada +
                ", duración=" + duración +
                ", cliente=" + cliente +
                '}';
    }
}
