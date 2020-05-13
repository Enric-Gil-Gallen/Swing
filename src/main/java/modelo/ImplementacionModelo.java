package modelo;

import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;
import vista.InformaVista;

import java.util.ArrayList;
import java.util.HashSet;


public class ImplementacionModelo implements CambioModelo, InterrogaModelo {
	/*
	private ArrayList<String> entradas = new ArrayList<String>();
	private int posicionActual = 0;
	*/
	private HashSet<Cliente> clientes= new HashSet<Cliente>();
	private HashSet<Factura> facturas= new HashSet<Factura>();
	private HashSet<Llamada> llamada= new HashSet<Llamada>();
	private HashSet<Tarifa> tarifas= new HashSet<Tarifa>();

	private InformaVista vista;
	public ImplementacionModelo(){}
	
	public void setVista(InformaVista vista) {
		this.vista = vista;
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