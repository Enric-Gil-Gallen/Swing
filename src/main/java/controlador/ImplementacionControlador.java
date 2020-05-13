package controlador;

import modelo.CambioModelo;
import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;
import vista.InterrogaVista;

import java.util.HashSet;

public class ImplementacionControlador implements Controlador {
	private InterrogaVista vista;
	private CambioModelo modelo;

	public ImplementacionControlador() {}

	public void setVista(InterrogaVista vista) {
		this.vista = vista;
	}

	public void setModelo(CambioModelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public void nuevoClienta(Cliente cliente) {
		//Cliente en = vista.getCliente();
		//modelo.nuevoClienta(en);
	}

	@Override
	public void nuevoTarifa(Tarifa farifa) {

	}

	@Override
	public void nuevoFactura(Factura factura) {

	}

	@Override
	public void nuevaLlamada(Llamada llamada) {

	}

	@Override
	public void borrarCliente(String nif) {

	}

	@Override
	public void cambiarTarifa(String nif, Tarifa tarifa) {

	}
}