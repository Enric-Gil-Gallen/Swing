package modelo;

import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;

import java.util.HashSet;

public interface InterrogaModelo {
    // Le interesa a la VISTA

    Cliente darCliente(String nif);

    HashSet<Cliente> todosLosClientes();

    HashSet<Llamada> todosLasLlamadas();

    HashSet<Llamada> todasLasLlamadasPorCliente(String nif);

    HashSet<Factura> todasLasFacturasPorCliente(String nif);

    String[] datosDeFacturaPorSuCodijo(String codigo);

    float calcularImporte(HashSet<Llamada> llamadas, Cliente cliente,Tarifa tarifa);
}
