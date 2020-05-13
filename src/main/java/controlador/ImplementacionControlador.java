package controlador;

import modelo.CambioModelo;
import vista.InterrogaVista;

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
	public void nuevoPartucular() {

	}

	@Override
	public void nuevoContacto() {

	}

	@Override
	public void nuevoTarifa() {

	}

	@Override
	public void nuevoFactura() {

	}

	@Override
	public void borrarCliente() {

	}

	@Override
	public void cambiarTarifa() {

	}

	@Override
	public void darCliente() {

	}

	@Override
	public void darCodigo() {

	}

	@Override
	public void emitirFacturaClaculandoImporte() {

	}
}