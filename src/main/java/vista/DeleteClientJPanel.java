package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteClientJPanel extends JPanel implements ActionListener {
    JButton button;
    JLabel deleteL;
    JTextField id;
    public DeleteClientJPanel() {
        deleteL =new JLabel("Introduce el NIF/CiF del cliente");
        add(deleteL);
        id= new JTextField();
        add(id);
        button = new JButton("Borrar");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            String idS=id.getText();
        }
    }
}
