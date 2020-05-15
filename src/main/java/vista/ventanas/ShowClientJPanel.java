package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import modelo.datos.Empresa;
import modelo.datos.Particular;
import vista.ImplementacionVista;
import vista.interfacesVentanas.cojerDatosModelo.ShowClientPanel;

import javax.swing.*;
import java.awt.*;
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

    public ShowClientJPanel(ImplementacionModelo modelo) {
        this.modelo = modelo;
        setPreferredSize( new Dimension( 1080, 1080 ));
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        textfield = new JTextField();
        textfield.setPreferredSize( new Dimension( 120, 24 ) );
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
        data = new Vector<String>();

        if (e.getSource() == byid) {
            if(textfield.getText().isEmpty()||textfield.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(this,
                        "El campo DNI esta vacio");
            }else {
                data.clear();
                panelList.removeAll();
                Cliente cl = modelo.darCliente(textfield.getText());
                if (cl != null){
                    data.add(cl.toString());
                    table = new JList<>(data);
                    panelList.add(table);
                    add(panelList);
                    panelList.revalidate();
                    panelList.repaint();
                }else {
                    JOptionPane.showMessageDialog(this,
                            "El DNI no coincide con niguno creado previamente");
                }
            }
        }

        if ((e.getSource() == all)) {
            data.clear();
            panelList.removeAll();
            HashSet<Cliente> clientes = modelo.todosLosClientes();

            if (clientes.isEmpty() == false){
                for (Cliente actual : clientes) {
                    data.add(actual.toString());
                }
                table = new JList<>(data);
                panelList.add(table);
                add(panelList);
                panelList.revalidate();
                panelList.repaint();
            }
            else {
                JOptionPane.showMessageDialog(this,
                        "Debes crear los clientes previamente");
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
