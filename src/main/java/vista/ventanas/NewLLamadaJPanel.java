package vista.ventanas;

import controlador.ImplementacionControlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewLLamadaJPanel extends JPanel implements ActionListener {
    JTextField nifT, numT, horainicioT, diaT, duracionT;
    JLabel nifL, numL, horainicioL, diaL,duracionL;
    JButton button;
    private ImplementacionControlador controlador;

    public NewLLamadaJPanel(ImplementacionControlador controlador) {
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 720 ));
        button = new JButton("OK");
        button.addActionListener(this);
        nifT = new JTextField();
        nifL = new JLabel("NIF/CIF");
        numT =new JTextField();
        numL = new JLabel("Número de telefono");
        horainicioT = new JTextField();
        horainicioL = new JLabel("hora inicip");
        diaT = new JTextField();
        diaL = new JLabel("Dia");
        duracionL= new JLabel("Duración");
        duracionT=new JTextField();
        add(nifL);
        add(nifT);
        add(numL);
        add(numT);
        add(horainicioL);
        add(horainicioT);
        add(diaL);
        add(diaT);
        add(duracionL);
        add(duracionT);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        //  Factura factura = new Particular(importT.getText(),/* clienteT.getText(),*/  Calendar.getInstance().getTime() /*,tarifaT.getText()*/, periodoT.getText(), tarifaT, direccionT.getText(), cpT.getText(), provinciaT.getText(), poblacionT.getText());
        //controlador.nuevaFactura(factura);
        JOptionPane.showMessageDialog(getParent(),
                "Llamada creada");
    }
}
