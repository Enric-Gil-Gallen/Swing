package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClientJPanel extends JPanel implements ActionListener {
    JTextField nifT, nombreT,direccionT,emailT,poblacionT, surnameT, cpT, provinciaT;
    JLabel nifL,nombreL,direccionL, emailL, poblacionL,surnameL,cpL, provinciaL;
    String nif, direccion,email,poblacion, surname, cp, provincia;
    JButton button;

    public NewClientJPanel(boolean business){
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
        }
        add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

        }
    }
}
