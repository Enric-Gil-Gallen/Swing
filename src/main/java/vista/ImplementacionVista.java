package vista;

//import org.omg.PortableServer.IMPLICIT_ACTIVATION_POLICY_ID;

import controlador.ImplementacionControlador;
import modelo.ImplementacionModelo;
import vista.ventanas.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImplementacionVista extends JFrame implements ActionListener {

    JPanel content;
    JLabel label;
    JMenu clientMenu, tarifaMenu, factLLMenu;
    JMenuItem newPartMI;
    JMenuItem newEnterpMI;
    JMenuItem deleteClientMI;
    JMenuItem showClientMI;
    JMenuItem tarifacreator;
    JMenuItem newFactura;
    JMenuItem newLlamada;
    JMenuItem displayFactura;
    JMenuItem displayLLamadas;
    private ImplementacionModelo modelo;
    private ImplementacionControlador controlador;

    public ImplementacionVista() {
        modelo = new ImplementacionModelo();
        controlador = new ImplementacionControlador(modelo);
        setTitle("Practica 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080, 720);
        content = new JPanel();
        content.setSize(1080, 720);
        getContentPane().add(content);
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
        newPartMI.addActionListener(this);
        newEnterpMI = new JMenuItem("Nueva Empresa");
        newEnterpMI.addActionListener(this);
        newClient.add(newPartMI);
        newClient.add(newEnterpMI);
        clientMenu.add(newClient);

        //Item delete
        deleteClientMI = new JMenuItem("Borrar Cliente");
        deleteClientMI.addActionListener(this);
        clientMenu.add(deleteClientMI);

        //Item ShowAll

        showClientMI = new JMenuItem("Listado y Busqueda de Clientes");
        showClientMI.addActionListener(this);
        clientMenu.add(showClientMI);

        menuBar.add(clientMenu);
        //Submenu tarifa

        tarifacreator = new JMenuItem("Creador de Tarifas");
        tarifacreator.addActionListener(this);
        tarifaMenu.add(tarifacreator);
        menuBar.add(tarifaMenu);

        // Submenu Factura y Llamada

        newFactura = new JMenuItem("Nueva Factura");
        newLlamada = new JMenuItem("Nueva Llamada");
        displayFactura = new JMenuItem("Mostar Facturas");
        displayLLamadas = new JMenuItem("Mostrar Llamadas");
        newFactura.addActionListener(this);
        newLlamada.addActionListener(this);
        displayFactura.addActionListener(this);
        displayLLamadas.addActionListener(this);
        factLLMenu.add(newFactura);
        factLLMenu.add(newLlamada);
        factLLMenu.add(displayFactura);
        factLLMenu.add(displayLLamadas);
        menuBar.add(factLLMenu);
/*
        label = new JLabel("<html> <pre>            _______________________________\n" +
                "          ________|   _    __   __  ___ ___ ___   |_______\n" +
                "          \\       |  /_\\  (_   /     |   |   |    |      /\n" +
                "           \\      | /   \\  __) \\__  _|_ _|_ _|_   |     /\n" +
                "           /      |_______________________________|     \\\n" +
                "          /__________)                        (__________\\\n" +
                "\t\t </pre> </html> ");


        label.setVisible(true);
        content.add(label);
 */
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
            content.removeAll();
            content.add(new NewClientJPanel(controlador));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == newEnterpMI) {
            content.removeAll();
            content.add(new NewBussinesJPanel(controlador));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == deleteClientMI) {
            content.removeAll();
            content.add(new DeleteClientJPanel(controlador));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == showClientMI) {
            content.removeAll();
            content.add(new ShowClientJPanel(modelo));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == tarifacreator) {
            content.removeAll();
            content.add(new TarifaCreatorJPanel(controlador));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == newFactura) {
            content.removeAll();
            content.add(new NewFactureJPanel(controlador, modelo));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == newLlamada) {
            content.removeAll();
            content.add(new NewLLamadaJPanel(controlador, modelo));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == displayFactura) {
            content.removeAll();
            content.add(new DisplayFacturaJPanel(modelo));
            pack();
            content.setVisible(true);
        }
        if (e.getSource() == displayLLamadas) {
            content.removeAll();
            content.add(new DisplayLlamadasJPanel(modelo));
            pack();
            content.setVisible(true);
        }
    }

}
