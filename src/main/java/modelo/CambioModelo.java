package modelo;

public interface CambioModelo {
    //Le interesa al CONTROLADOR
    void nuevoPartucular();
    void nuevoContacto();
    void nuevoTarifa();
    void nuevoFactura();

    void borrarCliente();

    void cambiarTarifa();

}
