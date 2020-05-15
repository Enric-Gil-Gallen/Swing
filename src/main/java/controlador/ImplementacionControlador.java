package controlador;

import modelo.CambioModelo;
import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;
import vista.ImplementacionVista;
import vista.InterrogaVista;

import java.util.HashSet;

public class ImplementacionControlador implements Controlador {
	private ImplementacionVista vista;
	private ImplementacionModelo modelo;

	public ImplementacionControlador(ImplementacionModelo modelo) {
		this.modelo = modelo;
	}
	public void setVista(ImplementacionVista vista) {
		this.vista = vista;
	}


	@Override
	public void nuevoClienta(Cliente cliente) {
		modelo.nuevoClienta(cliente);
	}

	@Override
	public void nuevoTarifa(Tarifa farifa) {
		modelo.nuevoTarifa(farifa);
	}

	@Override
	public void nuevoFactura(Factura factura) {
		modelo.nuevoFactura(factura);
	}

	@Override
	public void nuevaLlamada(Llamada llamada) {
		modelo.nuevaLlamada(llamada);
	}

	@Override
	public void borrarCliente(String dni) {
		modelo.borrarCliente(dni);
	}

	@Override
	public void cambiarTarifa(String nif, Tarifa tarifa) {
		modelo.cambiarTarifa(nif, tarifa);
	}
}