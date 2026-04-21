package views;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {

        setTitle("Sistema Logístico");
        setSize(420, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 245, 245));

        JLabel titulo = new JLabel("MENÚ PRINCIPAL");
        titulo.setBounds(95, 20, 250, 40);
        titulo.setFont(new Font("Arial", Font.BOLD, 26));
        titulo.setForeground(new Color(0, 102, 153));

        JButton btnListar = new JButton("Listar Vehículos");
        btnListar.setBounds(110, 90, 190, 40);
        btnListar.setFont(new Font("Arial", Font.BOLD, 14));

        JButton btnAgregar = new JButton("Agregar Vehículo");
        btnAgregar.setBounds(110, 145, 190, 40);
        btnAgregar.setFont(new Font("Arial", Font.BOLD, 14));

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(110, 200, 190, 40);
        btnSalir.setFont(new Font("Arial", Font.BOLD, 14));

        panel.add(titulo);
        panel.add(btnListar);
        panel.add(btnAgregar);
        panel.add(btnSalir);

        add(panel);

        btnListar.addActionListener(e -> {
            new ListarVehiculosView().setVisible(true);
        });

        btnAgregar.addActionListener(e -> {
            new AltaVehiculoView().setVisible(true);
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }
}