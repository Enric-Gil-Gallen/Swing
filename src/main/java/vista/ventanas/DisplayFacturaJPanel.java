package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import modelo.datos.Factura;

import javax.swing.*;
import java.awt.*;
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


    public DisplayFacturaJPanel(ImplementacionModelo modelo) {
        this.modelo = modelo;
        setPreferredSize( new Dimension( 1080, 720 ));
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
                data.clear();
                panelList.removeAll();
                HashSet<Factura> facturas = modelo.todasLasFacturasPorCliente(textfield.getText());
                if (facturas.isEmpty() == false){
                    for (Factura actual : facturas) {
                        data.add(actual.toString());
                    }
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
    }
}