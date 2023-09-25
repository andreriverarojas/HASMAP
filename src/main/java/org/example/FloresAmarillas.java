package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class FloresAmarillas extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Establecer el color de fondo
        setBackground(Color.WHITE);

        // Crear una instancia de Graphics2D
        Graphics2D g2d = (Graphics2D) g;

        // Definir el color de la flor
        Color amarillo = new Color(255, 255, 0); // Amarillo

        // Dibujar el círculo central de la flor
        g2d.setColor(amarillo);
        g2d.fill(new Ellipse2D.Double(100, 100, 60, 60));

        // Dibujar los pétalos de la flor
        g2d.setColor(Color.YELLOW);
        for (int i = 0; i < 6; i++) {
            g2d.fill(new Ellipse2D.Double(85, 85, 90, 70));
            g2d.rotate(Math.toRadians(60), 130, 130); // Rotar 60 grados
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Flores Amarillas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.add(new FloresAmarillas());
            frame.setVisible(true);
        });
    }
}
