package vista.interfacesVentanas.cojerDatosModelo;

import modelo.datos.Cliente;

import java.util.HashSet;

public interface ShowClientPanel {
    public Cliente obtenerPorDNI(String dni);
    public HashSet<Cliente> todosClientes();
}
