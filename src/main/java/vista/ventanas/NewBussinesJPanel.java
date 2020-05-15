package vista.ventanas;

import controlador.Controlador;
import controlador.ImplementacionControlador;
import modelo.ImplementacionModelo;
import modelo.datos.Empresa;
import modelo.datos.Particular;
import modelo.datos.Tarifa;
import modelo.datos.TarifaDia;
import vista.InformaVista;
import vista.InterrogaVista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class NewBussinesJPanel extends JPanel {
    JTextField nifT, nombreT,direccionT,emailT,poblacionT, surnameT, cpT, provinciaT;
    JLabel nifL,nombreL,direccionL, emailL, poblacionL,surnameL,cpL, provinciaL;
    String nif, direccion,email,poblacion, surname, cp, provincia;
    JButton button;
    boolean business;
    private Tarifa tarifaT;
    public ImplementacionControlador controlador;


    public NewBussinesJPanel(ImplementacionControlador controlador) {
        this.controlador = controlador;
        //Tarifa tarifaT = new TarifaDia();// Añadir campos de tarifas disponible
        button= new JButton("Ok"); //Crear boton
        button.addActionListener( new EscuchadorBoton()); // Conctar con la clase Interna
        String stringF= business ? "CIF" : "NIF";
        nifL= new JLabel(stringF);
        nifT = new JTextField();
        nifT.setPreferredSize( new Dimension( 200, 24 ) );
        add(nifL);
        add(nifT);
        direccionL = new JLabel("Dirección");
        add(direccionL);
        direccionT = new JTextField();
        add(direccionT);
        direccionT.setPreferredSize( new Dimension( 200, 24 ) );
        nombreL = new JLabel("Nombre");
        nombreT = new JTextField();
        nombreT.setPreferredSize( new Dimension( 200, 24 ) );
        add(nombreL);
        add(nombreT);
        cpL=new JLabel("Codigo Postal ");
        cpT=new JTextField();
        cpT.setPreferredSize( new Dimension( 200, 24 ) );
        add(cpL);
        add(cpT);
        poblacionL= new JLabel("Poblacion");
        poblacionT=new JTextField();
        poblacionT.setPreferredSize( new Dimension( 200, 24 ) );
        add(poblacionL);
        add(poblacionT);
        provinciaL = new JLabel("Provincia");
        provinciaT=new JTextField();
        provinciaT.setPreferredSize( new Dimension( 200, 24 ) );
        add(provinciaL);
        add(provinciaT);
        emailL= new JLabel("Email");
        emailT = new JTextField();
        emailT.setPreferredSize( new Dimension( 200, 24 ) );
        add(emailL);
        add(emailT);
        add(button);
    }

    class EscuchadorBoton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Empresa empresa = new Empresa(nifT.getText(),nombreT.getText(),emailT.getText(),Calendar.getInstance().getTime(), tarifaT, direccionT.getText(),cpT.getText(),provinciaT.getText(), poblacionT.getText());
            controlador.nuevoClienta(empresa);
            }

    }

}
