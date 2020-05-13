package vista;

import javax.swing.*;

public class NewClientJPanel extends JPanel {
    JTextField nifT, nombreT,direccionT,emailT,poblacionT, surnameT, cpT, provinciaT;
    JLabel nifL,nombreL,direccionL, emailL, poblacionL,surnameL,cpL, provinciaL;
    String nif, direccion,email,poblacion, surname, cp, provincia;

    public NewClientJPanel(boolean business){
        setVisible(true);
        String stringF= business ? "CIF" : "NIF";
        nifL= new JLabel(stringF);
        nifT = new JTextField();
        add(nifL);
        add(nifT);
        direccionL = new JLabel("Dirección");
        direccionT = new JTextField();
        add(direccionT);
        add(direccionL);
        nombreL = new JLabel("Nombre");
        nombreT = new JTextField();
        add(nombreL);
        add(nombreT);
        if(!business){
            surnameL = new JLabel("Apellidos");
            surnameT = new JTextField();
            add(surnameL);
            cpL=new JLabel("Codigo Postal ");
            cpT=new JTextField();
            add(cpL);
            add(cpT);
            poblacionL= new JLabel("Poblacion");
            poblacionT=new JTextField();
            add(poblacionL);
            add(poblacionT);
            provinciaL = new JLabel("Provincia");
            provinciaT=new JTextField();
            add(provinciaL);
            add(poblacionT);
        }

    }
    public void creaGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ImplementacionVista vista = new ImplementacionVista();
                vista.setVisible(true);

            }
        });
    }
}
