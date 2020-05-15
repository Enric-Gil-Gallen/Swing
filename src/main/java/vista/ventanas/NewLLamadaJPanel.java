package vista.ventanas;

import controlador.ImplementacionControlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewLLamadaJPanel extends JPanel {
    JTextField nifT, numT, horainicioT, diaT;
    JLabel nifL, importeL, fechaL,periodoL;
    JButton button;
    private ImplementacionControlador controlador;

    public NewLLamadaJPanel(ImplementacionControlador controlador) {
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 720 ));
        button = new JButton("OK");
        nifT = new JTextField();
        nifL = new JLabel("NIF/CIF");
        numT =new JTextField();
        importeL = new JLabel("Importe");
        horainicioT = new JTextField();
        fechaL = new JLabel("Fecha");
        diaT = new JTextField();
        periodoL = new JLabel("Periodo");
        add(nifL);
        add(nifT);
        add(importeL);
        add(numT);
        add(fechaL);
        add(horainicioT);
        add(periodoL);
        add(diaT);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        //  Factura factura = new Particular(importT.getText(),/* clienteT.getText(),*/  Calendar.getInstance().getTime() /*,tarifaT.getText()*/, periodoT.getText(), tarifaT, direccionT.getText(), cpT.getText(), provinciaT.getText(), poblacionT.getText());
        //controlador.nuevaFactura(factura);
        JOptionPane.showMessageDialog(getParent(),
                "Factura creada");
    }
}
