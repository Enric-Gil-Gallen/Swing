package vista;

import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Particular;
import modelo.datos.Tarifa;

public interface InformaVista {
    // Comunicarse directamente con el MODELO

    void nuevoPartucular(Particular particular);
    void nuevoTarifa(Tarifa tarifa);
    void nuevoFactura(Factura factura);
    void nuevaLlama(Llamada llamada);

    void clienteBorrado(String nif);

    void cambiadaTarifa(String nif, Tarifa tarifa);

    void cambiadaFactura();

    void emitirFacturaClaculandoImporte();
}
