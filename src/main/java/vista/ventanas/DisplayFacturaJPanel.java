package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;

import javax.swing.*;
import java.util.HashSet;
import java.util.Vector;

public class DisplayFacturaJPanel extends JPanel {
    JLabel labelByID;
    JButton all, byid;
    JList<String>table;
    HashSet<Cliente> clientes;
    private ImplementacionModelo modelo;
    Vector<String> data;

    public DisplayFacturaJPanel() {
        modelo = new ImplementacionModelo();
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        byid= new JButton("Buscar");
        add(byid);
        all = new JButton("Obtener todos");
        table = new JList<>(data);
        add(table);
    }
}
