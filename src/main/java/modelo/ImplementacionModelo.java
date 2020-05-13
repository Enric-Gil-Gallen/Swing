package modelo;

import modelo.datos.Cliente;
import modelo.datos.Factura;
import modelo.datos.Llamada;
import modelo.datos.Tarifa;
import vista.InformaVista;

import java.util.HashSet;
import java.util.Iterator;


public class ImplementacionModelo implements CambioModelo, InterrogaModelo {
	/*
	private ArrayList<String> entradas = new ArrayList<String>();
	private int posicionActual = 0;
	*/
	private HashSet<Cliente> clientes= new HashSet<Cliente>();
	private HashSet<Factura> facturas= new HashSet<Factura>();
	private HashSet<Llamada> llamadas= new HashSet<Llamada>();
	private HashSet<Tarifa> tarifas= new HashSet<Tarifa>();

	private InformaVista vista;
	public ImplementacionModelo(){}
	
	public void setVista(InformaVista vista) {
		this.vista = vista;
	}


	@Override
	public void nuevoClienta(Cliente cliente) {
		clientes.add(cliente);
	}


	@Override
	public void nuevoTarifa(Tarifa farifa) {
		tarifas.add(farifa);
	}

	@Override
	public void nuevoFactura(Factura factura) {
		facturas.add(factura);
	}

	@Override
	public void nuevaLlamada(Llamada llamada) {
		llamadas.add(llamada);
	}

	@Override
	public void borrarCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()){
			if (nif.equals(it.next().getNif())){
				clientes.remove(it.next());
			}
		}
	}

	@Override
	public void cambiarTarifa(String nif, Tarifa tarifa) {
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()){
			if (nif.equals(it.next().getNif())){
				it.next().setTarifa(tarifa);
			}
		}
	}


	@Override
	public Cliente darCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()){
			if (nif.equals(it.next().getNif())){
				return it.next();
			}
		}
		return null;
	}

	@Override
	public HashSet<Cliente> todosLosClientes() {
		return clientes;
	}

	@Override
	public HashSet<Llamada> todosLasLlamadas() {
		return llamadas;
	}

	@Override
	public HashSet<Llamada> todasLasLlamadasPorCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while (it.hasNext()) {
			if (nif.equals(it.next().getNif())) {
				// Encontrar referencia al cliente
				Cliente propietario = it.next();

				// Crear nuevo HashSet para enviar
				HashSet<Llamada> llamadasCliente = new HashSet<Llamada>();

				// Rellenar nuevo HashSet con la informacion pertiente
				Iterator<Llamada> ll = llamadas.iterator();
				while (ll.hasNext()) {
					if (propietario.equals(ll.next().getCliente())) {
						llamadasCliente.add(ll.next());
					}
				}
				return llamadasCliente;
			}
		}
		return null;
	}

	@Override
	public HashSet<Factura> todasLasFacturasPorCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while (it.hasNext()) {
			if (nif.equals(it.next().getNif())) {
				// Encontrar referencia al cliente
				Cliente propietario = it.next();

				// Crear nuevo HashSet para enviar
				HashSet<Factura> facturasCliente = new HashSet<Factura>();

				// Rellenar nuevo HashSet con la informacion pertiente
				Iterator<Factura> ll = facturas.iterator();
				while (ll.hasNext()) {
					if (propietario.equals(ll.next().getCliente())) {
						facturasCliente.add(ll.next());
					}
				}
				return facturasCliente;
			}
		}
		return null;
	}

	@Override
	public String[] datosDeFacturaPorSuCodijo(String codigo) {
		String[] datos = new String[6];
		Iterator<Factura> it = facturas.iterator();
		while(it.hasNext()){
			if (codigo.equals(it.next().getId())){
				Factura nueva = it.next();
				datos[0] = String.valueOf(nueva.getImporte());
				datos[1] = String.valueOf(nueva.getCliente());
				datos[2] = String.valueOf(nueva.getFecha());
				datos[3] = String.valueOf(nueva.getTarifa());
				datos[5] = String.valueOf(nueva.getId());
				datos[6] = String.valueOf(nueva.getPeriodo());
				return datos;
			}
		}
		return null;
	}

	@Override
	public Factura emitirFacturaClaculandoImporte() {
		return null;
	}
}