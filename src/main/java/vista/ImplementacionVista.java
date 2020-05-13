package vista;

import javax.swing.*;
import java.awt.*;

public class ImplementacionVista {

    private void GUI() {

        //Frame

        JFrame ventana = new JFrame("Practica 4");
        ventana.setSize(1080, 720);
        ventana.setVisible(true);

        //Menu
        JMenuBar menuBar= new JMenuBar();
        JMenu menu = new JMenu();
        JMenu clientMenu=new JMenu();
        JMenu tarifaMenu=new JMenu();
        JMenu FactLLMenu=new JMenu();
        //Submenu Contact

        //Submenu new
        JMenu newClient= new JMenu();
        JMenuItem newPartMI=new JMenuItem();
        JMenuItem newEnterpMI=new JMenuItem();
        newClient.add(newPartMI,newEnterpMI);
        clientMenu.add(newClient);

        //Item delete
        JMenuItem deleteClientMI= new JMenuItem();
        clientMenu.add(deleteClientMI);

        //Item ShowAll

        JMenuItem showAllClientMI = new JMenuItem();
        clientMenu.add(showAllClientMI);

        //Item Show by NIF/CIF

        JMenuItem showBYMI =new JMenuItem();
        clientMenu.add(showBYMI);

        //Submenu tarifa

        JMenuItem tarifacreator = new JMenuItem();
        JMenuItem displayTarifas = new JMenuItem();
        tarifaMenu.add(tarifacreator, displayTarifas);
        menu.add(tarifaMenu);

        // Submenu Factura y Llamada

        JMenuItem newFactura= new JMenuItem();
        JMenuItem newLlamada = new JMenuItem();
        JMenuItem displayFactura = new JMenuItem();
        JMenuItem displayLLamadas = new JMenuItem();
        FactLLMenu.add(newFactura, newLlamada);
        FactLLMenu.add(displayFactura, displayLLamadas);
        menu.add(FactLLMenu);

        //add submenus

        menu.add(newClient);

        //ADD  menu to frame
        menuBar.add(menu);
        ventana.setJMenuBar(menuBar);



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
            Container contenedor = ventana.getContentPane();
            //Cambiamos el gestor de aspecto.
            contenedor.setLayout(new FlowLayout());
            contenedor.add(new JButton("Particular"), BorderLayout.NORTH);
            contenedor.add(new JButton("Empresa"), BorderLayout.NORTH);
            JPanel jpEntrada = new JPanel();
            contenedor.add(new JButton("Borrar Cliente"));
            contenedor.add(new JButton("Cuatro"));
            contenedor.add(new JButton("BorderLayout.WEST"), BorderLayout.WEST);
            contenedor.add(new JButton("Salir"));

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
