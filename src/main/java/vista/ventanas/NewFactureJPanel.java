package vista.ventanas;

import javax.swing.*;

public class NewFactureJPanel extends JPanel {
    JTextField nifT, importT,fechaT,periodoT;
    JLabel nifL, importeL, fechaL,periodoL;
    JButton button;

    public NewFactureJPanel() {
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
}
