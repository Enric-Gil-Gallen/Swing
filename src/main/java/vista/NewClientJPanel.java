package vista;

import modelo.datos.Empresa;
import modelo.datos.Particular;
import modelo.datos.Tarifa;
import sun.plugin.dom.html.HTMLBodyElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class NewClientJPanel extends JPanel implements ActionListener {
    JTextField nifT, nombreT,direccionT,emailT,poblacionT, surnameT, cpT, provinciaT;
    JLabel nifL,nombreL,direccionL, emailL, poblacionL,surnameL,cpL, provinciaL;
    String nif, direccion,email,poblacion, surname, cp, provincia;
    JButton button;
    boolean business;
    private Tarifa tarifaT;

    public NewClientJPanel(boolean business){
        this.business=business;
        tarifaT=new Tarifa(2);// Añadir campos de tarifas disponible
        button= new JButton("Ok");
        setSize(1080, 720);
        button.addActionListener(this);
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
        if(!business){
            surnameL = new JLabel("Apellidos");
            surnameT = new JTextField();
            surnameT .setPreferredSize( new Dimension( 200, 24 ) );
            add(surnameL);
            add(surnameT);
        }
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
        add(emailT);
        add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (!business) {
                Particular particular = new Particular(nifT.getText(),nombreT.getText(),surnameT.getText(),emailT.getText(), Calendar.getInstance().getTime(), tarifaT,direccionT.getText(),  cpT.getText() , provinciaT.getText(), poblacionT.getText());
            } else {
                Empresa empresa = new Empresa(nifT.getText(),nombreT.getText(),emailT.getText(),Calendar.getInstance().getTime(), tarifaT, direccionT.getText(),cpT.getText(),provinciaT.getText(), poblacionT.getText());
            }
        }
    }
}
