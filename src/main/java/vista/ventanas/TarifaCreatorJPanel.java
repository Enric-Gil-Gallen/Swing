package vista.ventanas;

import javax.swing.*;

public class TarifaCreatorJPanel extends JPanel {
    ButtonGroup group;
    JRadioButton basic, byhours, bydays;
    JTextField importeL, periodo;
    JButton save;

    public TarifaCreatorJPanel() {
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
        JPanel panelEdit=new JPanel();
        periodo = new JTextField();//implementar
        importeL=new JTextField();
        panelEdit.add(importeL);
        save =new JButton("Guardar");
        panelEdit.add(save);
    }

}
