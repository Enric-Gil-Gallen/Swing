package vista.ventanas;

import controlador.Controlador;
import controlador.ImplementacionControlador;
import modelo.ImplementacionModelo;
import modelo.datos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.HashSet;
import java.util.UUID;

public class NewFactureJPanel extends JPanel implements ActionListener {
    JTextField nifT,fechaT,periodoT;
    JLabel nifL, fechaL,periodoL;
    JButton button;
    private ImplementacionControlador controlador;
    private ImplementacionModelo modelo;

    public NewFactureJPanel(ImplementacionControlador controlador, ImplementacionModelo modelo) {
        this.controlador = controlador;
        this.modelo = modelo;
        setPreferredSize( new Dimension( 1080, 720 ));
        button = new JButton("OK");
        button.addActionListener( this); // Conctar con la clase Interna
        nifT = new JTextField();
        nifL = new JLabel("NIF/CIF");
        //importT =new JTextField();
        //importeL = new JLabel("Importe");
        fechaT= new JTextField();
        fechaL = new JLabel("Fecha");
        periodoT = new JTextField();
        periodoL = new JLabel("Periodo");
        nifT.setPreferredSize( new Dimension( 200, 24 ) );
        //importT.setPreferredSize( new Dimension( 200, 24 ) );
        fechaT.setPreferredSize( new Dimension( 200, 24 ) );
        periodoT.setPreferredSize( new Dimension( 200, 24 ) );
        add(nifL);
        add(nifT);
        //add(importeL);
        //add(importT);
        add(fechaL);
        add(fechaT);
        add(periodoL);
        add(periodoT);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if(nifT.getText().isEmpty()||nifT.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(getParent(),
                        "El DNI es obligatorio para identificar el cliente");
            }else {
                Cliente cliente = modelo.darCliente(nifT.getText());
                Tarifa tarifa =  modelo.darTarifa(cliente);
                HashSet<Llamada> llamadas = modelo.todasLasLlamadas();
                Factura factura =  new Factura( cliente,
                        fechaT.getText(),
                        tarifa,
                        Integer.parseInt(periodoT.getText()),
                        modelo.calcularImporte(llamadas, cliente, tarifa));
                controlador.nuevoFactura(factura);
                JOptionPane.showMessageDialog(getParent(),
                        "Factura creada");
            }
        }

    }

}
