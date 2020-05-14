package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import modelo.datos.Empresa;
import modelo.datos.Particular;
import vista.interfacesVentanas.cojerDatosModelo.ShowClientPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ShowClientJPanel extends JPanel implements ActionListener, ShowClientPanel {
    JLabel labelByID;
    JButton all, byid;
    JList<String> table;
    private ImplementacionModelo modelo;
    Vector<String> data;

    public ShowClientJPanel() {
        modelo = new ImplementacionModelo();
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        byid = new JButton("Buscar");
        byid.addActionListener(this);
        add(byid);
        all = new JButton("Obtener todos");
        all.addActionListener(this);
        add(all);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == byid) {
            data = new Vector<String>();
            Cliente cl = modelo.darCliente(labelByID.getText());
            String cli = cl.toString();
            data.add(cli);
            table = new JList<>(data);
            add(table);
            updateUI();
        }

        if ((e.getSource() == all)) {
            HashSet<Cliente> clientes = modelo.todosLosClientes();
            data = new Vector<String>();
            for (Cliente actual : clientes) {
                String cli = actual.toString();
                data.add(cli);
            }
            data.add("dd");
            table = new JList<>(data);
            add(table);
            System.out.println("XX");
            repaint();
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
