package vista.ventanas;

import controlador.Controlador;
import controlador.ImplementacionControlador;
import modelo.datos.Factura;
import modelo.datos.Particular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Calendar;

public class NewFactureJPanel extends JPanel {
    JTextField nifT, importT,fechaT,periodoT;
    JLabel nifL, importeL, fechaL,periodoL;
    JButton button;
    private ImplementacionControlador controlador;

    public NewFactureJPanel(ImplementacionControlador controlador) {
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 720 ));
        button = new JButton("OK");
        nifT = new JTextField();
        nifL = new JLabel("NIF/CIF");
        importT =new JTextField();
        importeL = new JLabel("Importe");
        fechaT= new JTextField();
        fechaL = new JLabel("Fecha");
        periodoT = new JTextField();
        periodoL = new JLabel("Periodo");
        add(nifL);
        add(nifT);
        add(importeL);
        add(importT);
        add(fechaL);
        add(fechaT);
        add(periodoL);
        add(periodoT);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
      //  Factura factura = new Particular(importT.getText(),/* clienteT.getText(),*/  Calendar.getInstance().getTime() /*,tarifaT.getText()*/, periodoT.getText(), tarifaT, direccionT.getText(), cpT.getText(), provinciaT.getText(), poblacionT.getText());
        //controlador.nuevaFactura(factura);
        JOptionPane.showMessageDialog(getParent(),
                "Factura creada");
    }

}
