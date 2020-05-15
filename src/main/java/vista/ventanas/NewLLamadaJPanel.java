package vista.ventanas;

import controlador.ImplementacionControlador;
import modelo.ImplementacionModelo;
import modelo.datos.Llamada;
import modelo.datos.Particular;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class NewLLamadaJPanel extends JPanel implements ActionListener {
    JTextField nifT, numT, horainicioT, diaT, duracionT;
    JLabel nifL, numL, horainicioL, diaL,duracionL;
    JButton button;
    private ImplementacionControlador controlador;
    private ImplementacionModelo modelo;

    public NewLLamadaJPanel(ImplementacionControlador controlador, ImplementacionModelo modelo) {
        this.modelo = modelo;
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 720 ));
        button = new JButton("OK");
        button.addActionListener(this);
        nifT = new JTextField();
        nifL = new JLabel("NIF/CIF");
        numT =new JTextField();
        numL = new JLabel("Número de telefono");
        horainicioT = new JTextField();
        horainicioL = new JLabel("Hora inicio (segundos)");
        diaT = new JTextField();
        diaL = new JLabel("Dia (del 0 al 7)");
        duracionL= new JLabel("Duración llamada (segundos");
        duracionT=new JTextField();
        nifT.setPreferredSize( new Dimension( 200, 24 ) );
        numT.setPreferredSize( new Dimension( 200, 24 ) );
        horainicioT.setPreferredSize( new Dimension( 200, 24 ) );
        diaT.setPreferredSize( new Dimension( 200, 24 ) );
        duracionT.setPreferredSize( new Dimension( 200, 24 ) );
        add(nifL);
        add(nifT);
        add(numL);
        add(numT);
        add(horainicioL);
        add(horainicioT);
        add(diaL);
        add(diaT);
        add(duracionL);
        add(duracionT);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if(nifT.getText().isEmpty()||nifT.getText().compareTo("")==0){
                JOptionPane.showMessageDialog(getParent(),
                        "El DNI es obligatorio para identificar el cliente");
            }else {
                Llamada llamada =  new Llamada(Integer.parseInt(numT.getText()), Integer.parseInt(horainicioT.getText()), Integer.parseInt(diaT.getText()), Integer.parseInt(duracionT.getText()), modelo.darCliente(nifT.getText()));
                controlador.nuevaLlamada(llamada);
                JOptionPane.showMessageDialog(getParent(),
                        "Llamada creada");
            }
        }
    }

}
