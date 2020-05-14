package vista.ventanas;

import controlador.Controlador;
import modelo.ImplementacionModelo;
import modelo.datos.Empresa;
import modelo.datos.Particular;
import modelo.datos.Tarifa;
import vista.InterrogaVista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.Calendar;

public class NewBussinesJPanel extends JPanel /*implements InterrogaVista */{
    JTextField nifT, nombreT,direccionT,emailT,poblacionT, surnameT, cpT, provinciaT;
    JLabel nifL,nombreL,direccionL, emailL, poblacionL,surnameL,cpL, provinciaL;
    String nif, direccion,email,poblacion, surname, cp, provincia;
    JButton button;
    boolean business;
    private Tarifa tarifaT;

    private Controlador controlador;
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    //private ImplementacionModelo modelo;
    /*public void setModelo(ImplementacionModelo modelo) {
        this.modelo = modelo;
    }*/

    public NewBussinesJPanel(){
        tarifaT=new Tarifa(2);// Añadir campos de tarifas disponible
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

    private class EscuchadorBoton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println("dfgihsuogfhsdilbgil");
                Empresa empresa = new Empresa(nifT.getText(),nombreT.getText(),emailT.getText(),Calendar.getInstance().getTime(), tarifaT, direccionT.getText(),cpT.getText(),provinciaT.getText(), poblacionT.getText());
                System.out.println("aaaaaaaaaaaaaaaa");
                controlador.nuevoClienta(empresa);

            }
        }
    }

}
