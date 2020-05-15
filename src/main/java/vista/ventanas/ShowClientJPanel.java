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
    JPanel panelList;
    JLabel labelByID;
    JTextField textfield;
    JButton all, byid;
    JList<String> table;
    private ImplementacionModelo modelo;
    Vector<String> data;

    public ShowClientJPanel() {
        modelo = new ImplementacionModelo();
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        textfield = new JTextField();
        add(textfield);
        byid = new JButton("Buscar");
        byid.addActionListener(this);
        add(byid);
        all = new JButton("Obtener todos");
        all.addActionListener(this);
        add(all);
        panelList =new JPanel();
        add(panelList);
        data = new Vector<>();
        table =new JList<>(data);
        panelList.add(table);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == byid) {
            if(textfield.getText().isEmpty()||textfield.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(this,
                        "Campo Vacio");
            }else {
                panelList.removeAll();
                data = new Vector<String>();
                Cliente cl = modelo.darCliente(textfield.getText());
                String cli = cl.toString();
                data.add(cli);
                table = new JList<>(data);
                panelList.add(table);
                add(panelList);
                panelList.revalidate();
                panelList.repaint();
            }
        }

        if ((e.getSource() == all)) {
            panelList.removeAll();
            HashSet<Cliente> clientes = modelo.todosLosClientes();
            data.clear();
            for (Cliente actual : clientes) {
                String cli = actual.toString();
                data.add(cli);
            }
            table = new JList<>(data);
            panelList.add(table);
            add(panelList);
            panelList.revalidate();
            panelList.repaint();
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
