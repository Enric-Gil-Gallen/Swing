package vista.ventanas;

import modelo.datos.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class ShowClientJPanel extends JPanel implements ActionListener {
    JLabel labelByID;
    JButton all, byid;
    JTable table;
    HashSet<Cliente> clientes;

    public ShowClientJPanel() {
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

    }
}
