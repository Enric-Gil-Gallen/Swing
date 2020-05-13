package vista;

import org.omg.PortableServer.IMPLICIT_ACTIVATION_POLICY_ID;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementacionVista extends JFrame implements ActionListener {

    JPanel content;
    JMenu clientMenu, tarifaMenu, factLLMenu;
    JMenuItem newPartMI, newEnterpMI, deleteClientMI, showAllClientMI, showBYMI, tarifacreator, displayTarifas, newFactura, newLlamada,
            displayFactura, displayLLamadas;

    public ImplementacionVista() {
        setTitle("Practica 4");
        setSize(1080, 720);
        content = new JPanel();
        add(content);
        //Menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setVisible(true);
        clientMenu = new JMenu("Cliente");
        tarifaMenu = new JMenu("Tarifa");
        factLLMenu = new JMenu("Factura y llamadas");
        //Submenu Contact

        //Submenu new
        JMenu newClient = new JMenu("Nuevo CLiente");
        newPartMI = new JMenuItem("Nuevo Particular");
        newEnterpMI = new JMenuItem("Nueva Empresas");
        newClient.add(newPartMI);
        newClient.add(newEnterpMI);
        clientMenu.add(newClient);

        //Item delete
        deleteClientMI = new JMenuItem("Borrar Cliente");
        clientMenu.add(deleteClientMI);

        //Item ShowAll

        showAllClientMI = new JMenuItem("Listado de Clientes");
        clientMenu.add(showAllClientMI);

        //Item Show by NIF/CIF

        showBYMI = new JMenuItem("Busqueda de clientes");
        clientMenu.add(showBYMI);

        menuBar.add(clientMenu);
        //Submenu tarifa

        tarifacreator = new JMenuItem("Creador de Tarifas");
        displayTarifas = new JMenuItem("Mostrar Traifas");
        tarifaMenu.add(tarifacreator);
        tarifaMenu.add(displayTarifas);
        menuBar.add(tarifaMenu);

        // Submenu Factura y Llamada

        newFactura = new JMenuItem("Nueva Factura");
        newLlamada = new JMenuItem("Nueva Llamada");
        displayFactura = new JMenuItem("Mostar Facturas");
        displayLLamadas = new JMenuItem("Mostrar Llamadas");
        factLLMenu.add(newFactura);
        factLLMenu.add(newLlamada);
        factLLMenu.add(displayFactura);
        factLLMenu.add(displayLLamadas);
        menuBar.add(factLLMenu);

        JLabel label = new JLabel("<html> <pre>            _______________________________\n" +
                "          ________|   _    __   __  ___ ___ ___   |_______\n" +
                "          \\       |  /_\\  (_   /     |   |   |    |      /\n" +
                "           \\      | /   \\  __) \\__  _|_ _|_ _|_   |     /\n" +
                "           /      |_______________________________|     \\\n" +
                "          /__________)                        (__________\\\n" +
                "\t\t </pre> </html> ");
        label.setVisible(true);
        content.add(label);

    }

    // Hacer que las operaciones grafiques !!!!! IMPORTANTE !!!!!
    public void creaGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ImplementacionVista vista = new ImplementacionVista();
                vista.setVisible(true);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newPartMI) {

        }
        if (e.getSource() == newEnterpMI) {

        }
        if (e.getSource() == deleteClientMI) {

        }
        if (e.getSource() == showAllClientMI) {

        }
        if (e.getSource() == showBYMI) {

        }
        if (e.getSource() == tarifacreator) {

        }
        if (e.getSource() == displayTarifas) {

        }
        if (e.getSource() == newFactura) {

        }
        if (e.getSource() == newLlamada) {

        }
        if (e.getSource() == displayFactura) {

        }
        if (e.getSource() == displayLLamadas) {

        }
    }

}
