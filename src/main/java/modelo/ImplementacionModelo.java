package modelo;

import modelo.datos.*;
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
		for (Cliente cliente : clientes){
			if (nif.equals(cliente.getNif())){
				clientes.remove(cliente);
			}
		}
	}

	@Override
	// Primero areglar la Clase tarifa, luego cambiar todos los datos necesarios
	public void cambiarTarifa(String nif, Tarifa tarifa) {
		for (Cliente cliente : clientes){
			if (nif.equals(cliente.getNif())){
				cliente.setTarifa(tarifa);
			}
		}
	}


	@Override
	public Cliente darCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()){
			Cliente cli = it.next();
			if (nif.equals(cli.getNif())){
				return cli;
			}
		}
		return null;
	}

	@Override
	public HashSet<Cliente> todosLosClientes() {
		return clientes;
	}

	@Override
	public HashSet<Llamada> todasLasLlamadasPorCliente(String nif) {
		Iterator<Cliente> it = clientes.iterator();
		while (it.hasNext()) {
			Cliente cliente = it.next();
			if (nif.equals(cliente.getNif())) {
				// Encontrar referencia al cliente
				Cliente propietario = cliente;

				// Crear nuevo HashSet para enviar
				HashSet<Llamada> llamadasCliente = new HashSet<Llamada>();

				// Rellenar nuevo HashSet con la informacion pertiente
				Iterator<Llamada> ll = llamadas.iterator();
				while (ll.hasNext()) {
					Llamada llamadaCliente = ll.next();
					if (propietario.equals(llamadaCliente.getCliente())) {
						llamadasCliente.add(llamadaCliente);
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
			Cliente ita = it.next();
			if (nif.equals(ita.getNif())) {
				// Encontrar referencia al cliente
				Cliente propietario = ita;

				// Crear nuevo HashSet para enviar
				HashSet<Factura> facturasCliente = new HashSet<Factura>();

				// Rellenar nuevo HashSet con la informacion pertiente
				Iterator<Factura> ll = facturas.iterator();
				while (ll.hasNext()) {
					Factura fac = ll.next();
					if (propietario.equals(fac.getCliente())) {
						facturasCliente.add(fac);
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
	/* Este metodo calcula el precio total
		- De todas las llamadas de un determinando CLIENTE
		- Teniendo en cuenta el tipo de tarifa que utilize
	 */
	public float calcularImporte(HashSet<Llamada> llamadas, Cliente cliente,Tarifa tarifa) {
		// º1 -- Crear resultado
		float resultado = -1;

		// º2 -- Recorer todas las llamadas en las que coincida el cliente
		Iterator<Llamada> it = llamadas.iterator();
		while(it.hasNext()) {
			Llamada ll = it.next();
			// 3º -- Ir calculadon importe dependiendo de del tipo de tarifa
			if (ll.getCliente() == cliente){

				if (cliente.getTarifa() instanceof TarifaDia) {
					if (ll.getDia() != ((TarifaDia) tarifa).getDia()){
						resultado += (ll.getDuración() * tarifa.getPrecio());;
					}
					else {
						resultado += (ll.getDuración() * ((TarifaDia) tarifa).getPrecioEspecial());
					}
				}
				else if (cliente.getTarifa() instanceof TarifasHoras){
					/*
						Int32 horas = (tsegundos / 3600);
						Int32 minutos = ((tsegundos-horas*3600)/60);
						Int32 segundos = tsegundos-(horas*3600+minutos*60);
					*/

					Integer llamadaHorasInicio = (ll.getHoraInicio() / 3600);
					Integer tarifaHorasInicio = ((TarifasHoras) tarifa).getHoraInicio() / 3600;

					if (llamadaHorasInicio == tarifaHorasInicio){
						resultado += (ll.getDuración() * ((TarifasHoras) tarifa).getPrecioEspecial());
					}else {
						resultado += (ll.getDuración() * tarifa.getPrecio());
					}
				}
				else {
					resultado += (ll.getDuración() * tarifa.getPrecio());
				}
			}
		}

		// Resultado
		return resultado;
	}

}