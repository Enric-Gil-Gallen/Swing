package vista;

import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;

public interface InterrogaVista {
    //Comprobar datos, para que pasen por el CONTROLADOR

    Cliente getCliente();
    Tarifa getTarifa();
    Llamada getLlamada();
    Factura getFactura();
    String getFacturasClientes();

    String getEntrada();
}