package vista;

public interface InformaVista {
    // Comunicarse directamente con el MODELO

    void nuevoPartucular();
    void nuevoTarifa();
    void nuevoFactura();
    void nuevaLlama();

    void clienteBorrado();

    void cambiadaTarifa();

    void cambiadafactura();

    void emitirFacturaClaculandoImporte();
}
