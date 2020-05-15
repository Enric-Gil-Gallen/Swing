package vista.ventanas;

import controlador.ImplementacionControlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteClientJPanel extends JPanel implements ActionListener {
    JButton button;
    JLabel deleteL;
    JTextField id;
    public ImplementacionControlador controlador;

    public DeleteClientJPanel(ImplementacionControlador controlador) {
        this.controlador = controlador;
        setPreferredSize( new Dimension( 1080, 720 ));
        deleteL =new JLabel("Introduce el NIF/CiF del cliente");
        add(deleteL);
        id= new JTextField();
        id.setPreferredSize( new Dimension( 200, 24 ) );
        add(id);
        button = new JButton("Borrar");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            String idS=id.getText();
            controlador.borrarCliente(idS);
        }
    }
}
