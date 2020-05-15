package modelo.datos;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

public class Llamada  implements Serializable {
    private static final long serialVersionUID = 42L;
    int numeroTelefono;
    int horaInicio;
    private int dia;
    int duración;
    Cliente cliente;

    public Llamada(int numeroTelefono, int horaInicio, int dia, int duración, Cliente cliente) {
        this.numeroTelefono = numeroTelefono;
        this.horaInicio = horaInicio;
        this.dia = dia;
        this.duración = duración;
        this.cliente = cliente;
    }


    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }


    public int getDuración() {
        return duración;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "numeroTelefono=" + numeroTelefono +
                ", horaInicio=" + horaInicio +
                ", dia=" + dia +
                ", duración=" + duración +
                ", cliente=" + cliente +
                '}';
    }

    public Integer getDia() {
        return dia;
    }
}
