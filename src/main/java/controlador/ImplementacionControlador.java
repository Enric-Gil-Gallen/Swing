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
		Cliente en = vista.getCliente();
		modelo.nuevoClienta(en);
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
	public void borrarCliente(String nif) {
		String dni = vista.getEntrada();
		modelo.borrarCliente(dni);
	}

	@Override
	public void cambiarTarifa(String nif, Tarifa tarifa) {
		String dni = vista.getEntrada();
		Tarifa tarifa1 = vista.getTarifa();
		modelo.cambiarTarifa(dni, tarifa1);
	}
}