package vista.ventanas;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JTextFieldNumeric extends JTextField {
    public JTextFieldNumeric() {
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    setEditable(true);
                } else {
                    setEditable(false);
                }
            }
        });
    }
}
