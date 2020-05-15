package vista.ventanas;

import modelo.ImplementacionModelo;
import modelo.datos.Cliente;
import modelo.datos.Llamada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Vector;

public class DisplayLlamadasJPanel extends JPanel implements ActionListener {
    JPanel panelList;
    JLabel labelByID;
    JTextField textfield;
    JButton byid;
    JList<String> table;
    private ImplementacionModelo modelo;
    Vector<String> data;

    public DisplayLlamadasJPanel(ImplementacionModelo modelo){
        this.modelo = modelo;
        setPreferredSize( new Dimension( 1080, 720 ));
        labelByID = new JLabel("Introduce el nif/cif del cliente");
        add(labelByID);
        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(200, 24));
        add(textfield);
        byid = new JButton("Buscar");
        byid.addActionListener(this);
        add(byid);
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
                            "El campo DNI esta vacio");
                }else {
                    data.clear();
                    panelList.removeAll();
                    HashSet<Llamada> cl = modelo.todasLasLlamadasPorCliente(textfield.getText());
                    if (cl != null){
                        for (Llamada actual : cl) {
                            data.add(actual.toString());
                        }
                        table = new JList<>(data);
                        panelList.add(table);
                        add(panelList);
                        panelList.revalidate();
                        panelList.repaint();
                    }else {
                        JOptionPane.showMessageDialog(this,
                                "El DNI no coincide con nigun cliente creado previamente");
                    }
                }
            }
        }
}
