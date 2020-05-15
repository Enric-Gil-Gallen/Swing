package vista.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarifaCreatorJPanel extends JPanel implements ActionListener {
    ButtonGroup group;
    JRadioButton basic, byhours, bydays;
    JTextField importeT, nombre, diaT, importeEspT, hInitT, hFinishT, importeET;

    JButton save;
    JPanel days, hour;

    public TarifaCreatorJPanel() {
        setPreferredSize(new Dimension(1080, 720));
        JPanel panel = new JPanel();
        group = new ButtonGroup();
        basic = new JRadioButton("Basica");
        group.add(basic);
        byhours = new JRadioButton("Por horas");
        group.add(byhours);
        bydays = new JRadioButton("Por dias");
        group.add(byhours);
        panel.add(basic);
        panel.add(byhours);
        panel.add(bydays);
        add(panel);
        JPanel panelEdit = new JPanel();
        nombre = new JTextField();
        nombre.setPreferredSize(new Dimension(200, 24));
        panel.add(nombre);
        importeT = new JTextField();
        importeT.setPreferredSize(new Dimension(200, 24));
        panelEdit.add(importeT);
        save = new JButton("Guardar");
        panelEdit.add(save);
        days = new JPanel();
        diaT = new JTextField();
        diaT.setPreferredSize(new Dimension(200, 24));
        importeEspT = new JTextField();
        importeEspT.setPreferredSize(new Dimension(200, 24));
        days.add(diaT);
        days.add(importeEspT);
        hour = new JPanel();
        hInitT = new JTextField();
        hInitT.setPreferredSize(new Dimension(200, 24));
        hFinishT = new JTextField();
        hFinishT.setPreferredSize(new Dimension(200, 24));
        importeET = new JTextField();
        importeET.setPreferredSize(new Dimension(200, 24));
        hour.add(hInitT);
        hour.add(hFinishT);
        hour.add(importeET);

        add(panelEdit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {

        }
    }
}
