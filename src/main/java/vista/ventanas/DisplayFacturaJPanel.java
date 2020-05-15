package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Vector;

public class DisplayFacturaJPanel extends JPanel implements ActionListener {
    JPanel panelList;
    JLabel labelByID;
    JTextField textfield;
    JButton all, byid;
    JList<String> table;
    private ImplementacionModelo modelo;
    Vector<String> data;


    public DisplayFacturaJPanel() {
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
            }else{
                panelList.removeAll();
                data = new Vector<String>();
                Cliente cl = modelo.darCliente(labelByID.getText());
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
}