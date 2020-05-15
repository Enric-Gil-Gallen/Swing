package vista.ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarifaCreatorJPanel extends JPanel implements ActionListener {
    ButtonGroup group;
    JRadioButton basic, byhours, bydays;
    JTextField importeT, nombre, diaT, importeEspT, hInitT, hFinishT, importeET;
    JLabel importeL, nombreL, diaL, importeEspL, hInitL, hFinishL, importeEL;
    JButton save;
    JPanel content, days, hour, basicP;

    public TarifaCreatorJPanel() {
        setPreferredSize(new Dimension(1080, 720));
        JPanel panel = new JPanel();
        content = new JPanel();
        group = new ButtonGroup();
        basic = new JRadioButton("Basica", true);
        basic.addActionListener(this);
        group.add(basic);
        byhours = new JRadioButton("Por horas");
        byhours.addActionListener(this);
        group.add(byhours);
        bydays = new JRadioButton("Por dias");
        group.add(bydays);

        panel.add(basic);
        panel.add(byhours);
        panel.add(bydays);
        add(panel);
        add(content);
        //Basica
        basicP = new JPanel();
        basicP.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre = new JTextField();
        nombre.setPreferredSize(new Dimension(200, 24));
        add(nombre);
        importeL = new JLabel("Importe");
        basicP.add(importeL);
        importeT = new JTextField();
        importeT.setPreferredSize(new Dimension(200, 24));//importe
        basicP.add(importeT);
        //day
        days = new JPanel();
        diaT = new JTextField();
        diaT.setPreferredSize(new Dimension(200, 24));
        importeEspT = new JTextField();
        importeEspT.setPreferredSize(new Dimension(200, 24));//importe
        days.add(diaT);
        days.add(importeEspT);
        //hour
        hour = new JPanel();
        hInitT = new JTextField();
        hInitT.setPreferredSize(new Dimension(200, 24));
        hFinishT = new JTextField();
        hFinishT.setPreferredSize(new Dimension(200, 24));
        importeET = new JTextField();
        importeET.setPreferredSize(new Dimension(200, 24)); //importe
        hour.add(hInitT);
        hour.add(hFinishT);
        hour.add(importeET);
        content.add(basicP);
        //save
        save = new JButton("Guardar");
        save.addActionListener(this);
        add(save);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {

        }
        if (e.getSource() == basic) {
            content.removeAll();
            content.add(basicP);
            content.revalidate();
            content.repaint();
        }
        if(e.getSource() ==byhours){
            content.removeAll();
            content.add(hour);
            content.revalidate();
            content.repaint();
        }
        if(e.getSource() ==bydays){
            content.removeAll();
            content.add(days);
            content.revalidate();
            content.repaint();
        }

    }
}
