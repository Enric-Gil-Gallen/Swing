package vista;

import javax.swing.*;
import java.awt.*;

public class ImplementacionVista {

    private void GUI() {
        /*
        // Crear ventana
            JFrame ventana = new JFrame("Practica 4");
            ventana.setSize(1080, 720);
            ventana.setVisible(true);

        // Añadir un boton
            JButton boton = new JButton("Boton");
            ventana.getContentPane().add(boton);
        */

        /*
        Crear Ventana + Botones con todas las zonas
        JFrame ventana = new JFrame("BorderLayout Manager");
        Container contenedor = ventana.getContentPane();
        contenedor.add(new JButton("BorderLayout.CENTER"),
                BorderLayout.CENTER);
        contenedor.add(new JButton("BorderLayout.NORTH"), BorderLayout.NORTH);
        contenedor.add(new JButton("BorderLayout.SOUTH"), BorderLayout.SOUTH);
        contenedor.add(new JButton("BorderLayout.EAST"), BorderLayout.EAST);
        contenedor.add(new JButton("BorderLayout.WEST"), BorderLayout.WEST);
        ventana.setSize(500, 500);
        ventana.setVisible(true);
        */

        // Ventana con botones normales
            JFrame ventana = new JFrame("FlowLayout Manager");
            Container contenedor = ventana.getContentPane();
            //Cambiamos el gestor de aspecto.
            contenedor.setLayout(new FlowLayout());
            contenedor.add(new JButton("Uno"));
            contenedor.add(new JButton("Dos"));
            contenedor.add(new JButton("Tres"));
            contenedor.add(new JButton("Cuatro"));
            contenedor.add(new JButton("Cinco"));

            //ventana.setSize(500, 500);
            // hacer que la ventana se adapte a los botones
            ventana.pack();
            ventana.setVisible(true);

    }

    // Hacer que las operaciones grafiques !!!!! IMPORTANTE !!!!!
    public void creaGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI();
            }
        });
    }

}
