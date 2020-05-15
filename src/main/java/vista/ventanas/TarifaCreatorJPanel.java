package vista.ventanas;

import controlador.ImplementacionControlador;
import modelo.datos.Tarifa;
import modelo.datos.TarifaBasica;
import modelo.datos.TarifaDia;
import modelo.datos.TarifasHoras;

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
    private ImplementacionControlador controlador;

    public TarifaCreatorJPanel(ImplementacionControlador controlador ) {
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 1080 ));
        JPanel panel = new JPanel();
        content = new JPanel();
        group = new ButtonGroup();
        basic = new JRadioButton("Basica", true);
        basic.setActionCommand("basic");
        basic.addActionListener(this);
        group.add(basic);
        byhours = new JRadioButton("Por horas");
        byhours.setActionCommand("horas");
        byhours.addActionListener(this);
        group.add(byhours);
        bydays = new JRadioButton("Por dias");
        bydays.setActionCommand("dias");
        bydays.addActionListener(this);
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
        nombreL =new JLabel("Nombre de la tarifa");
        add(nombreL);
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
        diaL = new JLabel("Dia especial");
        days.add(diaL);

        importeEspL =new JLabel("Importe del dia especial");
        days.add(importeEspL);
        importeEspT = new JTextField();
        importeEspT.setPreferredSize(new Dimension(200, 24));//importe
        days.add(diaT);
        days.add(importeEspT);
        //hour
        hour = new JPanel();
        hInitL = new JLabel("Hora inicial (24h)");
        hour.add(hInitL);
        hInitT = new JTextField();
        hInitT.setPreferredSize(new Dimension(200, 24));
        hFinishL= new JLabel("Hora final (24h)");
        hour.add(hInitL);
        hFinishT = new JTextField();
        hFinishT.setPreferredSize(new Dimension(200, 24));
        importeEL = new JLabel("Importe durante el periodo especial");
        hour.add(importeEL);
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
            String name = nombre.getText();
            double importe = Double.parseDouble(importeT.getText());
            if ("horas".equals(e.getActionCommand())) {
                double importeESp = Double.parseDouble(importeET.getText());
                int horINit=Integer.parseInt(hInitT.getText());
                int horFin=Integer.parseInt(hFinishT.getText());
                TarifasHoras tarifasHoras = new TarifasHoras(importe, name,horINit,horFin, importeESp);
                controlador.nuevoTarifa(tarifasHoras);
                JOptionPane.showMessageDialog(getParent(),
                        "Tarifa horas creada");
            } else if ("dias".equals(e.getActionCommand())) {
                double importeESp = Double.parseDouble(importeEspT.getText());
                int diaEsd=Integer.parseInt(diaT.getText());
                TarifaDia tarifasDia =new TarifaDia(importe,name,importeESp,diaEsd);
                controlador.nuevoTarifa(tarifasDia);
                JOptionPane.showMessageDialog(getParent(),
                        "Tarifa dias creada");

            } else {
                TarifaBasica tarifaBasica = new TarifaBasica(importe, name);
                controlador.nuevoTarifa(tarifaBasica);
                JOptionPane.showMessageDialog(getParent(),
                        "Tarifa basica creada");
            }
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
