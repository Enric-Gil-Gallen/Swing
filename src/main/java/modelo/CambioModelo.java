package modelo;

import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;

import java.util.HashSet;

public interface CambioModelo {
    //Le interesa al CONTROLADOR
    void nuevoClienta(Cliente cliente);
    void nuevoTarifa(Tarifa farifa);
    void nuevoFactura(Factura factura);
    void nuevaLlamada(Llamada llamada);

    void borrarCliente(String nif);

    void cambiarTarifa(String nif, Tarifa tarifa);

}
