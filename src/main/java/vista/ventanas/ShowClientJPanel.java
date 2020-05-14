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
    JList<String>table;
    private ImplementacionModelo modelo;
    Vector<String> data;

    public ShowClientJPanel() {
        modelo = new ImplementacionModelo();
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        byid= new JButton("Buscar");
        add(byid);
        all = new JButton("Obtener todos");
        table = new JList<>(data);
        add(table);
        data = new Vector<String>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == byid){
            Cliente cl = modelo.darCliente(labelByID.getText());

            if (cl instanceof Particular){
                String cli = ((Particular) cl).toString();
                data.add(cli);
            }
            if (cl instanceof Empresa){
                String cli = ((Empresa) cl).toString();
                data.add(cli);
            }
        }

        if((e.getSource() == all)){

            HashSet<Cliente> clientes = modelo.todosLosClientes();
            Iterator<Cliente> it = clientes.iterator();

            while(it.hasNext()){
                Cliente actual = it.next();

                if (actual instanceof Particular){
                    String cli = ((Particular) actual).toString();
                    data.add(cli);
                }
                if (actual instanceof Empresa){
                    String cli = ((Empresa) actual).toString();
                    data.add(cli);
                }

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
