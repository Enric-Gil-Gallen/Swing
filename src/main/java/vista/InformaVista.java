package vista;

import modelo.datos.*;

public interface InformaVista {
    // Comunicarse directamente con el MODELO

    void nuevoPartucular(Particular particular);
    void nuevoEmpresa(Empresa empresa);

   /* void nuevoTarifa(Tarifa tarifa);
    void nuevoFactura(Factura factura);
    void nuevaLlama(Llamada llamada);

    void clienteBorrado(String nif);

    void cambiadaTarifa(String nif, Tarifa tarifa);

    void cambiadaFactura();

    void emitirFacturaClaculandoImporte(); */
}
