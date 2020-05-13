package controlador;

public interface Controlador {
    void nuevoPartucular();
    void nuevoContacto();
    void nuevoTarifa();
    void nuevoFactura();

    void borrarCliente();

    void cambiarTarifa();

    void darCliente();

    void darCodigo();

    void emitirFacturaClaculandoImporte();

}
