package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import vista.interfacesVentanas.cojerDatosModelo.ShowClientPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

public class ShowClientJPanel extends JPanel implements ActionListener, ShowClientPanel {
    JLabel labelByID;
    JButton all, byid;
    JTable table;
    HashSet<Cliente> clientes;
    private ImplementacionModelo modelo;

    public ShowClientJPanel() {
        modelo = new ImplementacionModelo();
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        byid= new JButton("Buscar");
        add(byid);
        all = new JButton("Obtener todos");
        CustomModel customModel= new CustomModel();
        table = new JTable(customModel);
        add(table);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Crear LikedHaset

        if (e.getSource() == byid){
            System.out.println("Envio un cliente");
            // Comprobar si es Particular o Empresa -- TOCARIA PERO DA IGUAL

            /*
            * 1º new LikedHaset
            *
            *
            * */

            // SACAR DATOS DE CLIENTE
            /*
            = obtenerPorDNI(texto).getNif();
            = oobtenerPorDNI(texto).getNombre();
            = oobtenerPorDNI(texto).getFecha();
            = oobtenerPorDNI(texto).getEmail();
            = oobtenerPorDNI(texto).getDireccion();
            = oobtenerPorDNI(texto).getPoblacion();
            = oobtenerPorDNI(texto).getProvincia();
            = oobtenerPorDNI(texto).getCp();
            = oobtenerPorDNI(texto).getTarifa();
            */


        }

        if((e.getSource() == all){
            System.out.println("Envio todos los clientes");
            // RECORRER HASMAP
            Iterator<Cliente> it = clientes.iterator();
            while(it.hasNext()){
            /*
            = obtenerPorDNI(texto).getNif();
            = oobtenerPorDNI(texto).getNombre();
            = oobtenerPorDNI(texto).getFecha();
            = oobtenerPorDNI(texto).getEmail();
            = oobtenerPorDNI(texto).getDireccion();
            = oobtenerPorDNI(texto).getPoblacion();
            = oobtenerPorDNI(texto).getProvincia();
            = oobtenerPorDNI(texto).getCp();
            = oobtenerPorDNI(texto).getTarifa();
            */
            }
        }
    }

    @Override
    public Cliente obtenerPorDNI(String dni) {
        return modelo.darCliente(dni);
    }

    @Override
    public HashSet<Cliente> todosClientes() {
        return modelo.todosLosClientes();
    }
}
