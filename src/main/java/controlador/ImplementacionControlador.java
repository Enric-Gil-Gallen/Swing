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
	private InterrogaVista vista;
	private ImplementacionModelo modelo;

	public ImplementacionControlador() {
		modelo = new ImplementacionModelo();
		//vista = new InterrogaVista() {
	}

	public void setVista(InterrogaVista vista) {
		this.vista = vista;
	}


	@Override
	public void nuevoClienta(Cliente cliente) {
		modelo.nuevoClienta(cliente);
	}

	@Override
	public void nuevoTarifa(Tarifa farifa) {
		Tarifa ta = vista.getTarifa();
		modelo.nuevoTarifa(ta);
	}

	@Override
	public void nuevoFactura(Factura factura) {
		Factura tarifa = vista.getFactura();
		modelo.nuevoFactura(tarifa);
	}

	@Override
	public void nuevaLlamada(Llamada llamada) {
		Llamada llama = vista.getLlamada();
		modelo.nuevaLlamada(llama);
	}

	@Override
	public void borrarCliente(String dni) {
		modelo.borrarCliente(dni);
	}

	@Override
	public void cambiarTarifa(String nif, Tarifa tarifa) {
		String dni = vista.getEntrada();
		Tarifa tarifa1 = vista.getTarifa();
		modelo.cambiarTarifa(dni, tarifa1);
	}
}