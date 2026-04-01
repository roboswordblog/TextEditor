import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Coding IDE");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        window.setLayout(null);

        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Load");
        saveButton.setBounds(10, 10, 100, 40);
        openButton.setBounds(110, 10, 100, 40);
        saveButton.setBackground(new Color(45, 45, 45));
        openButton.setBackground(new Color(45, 45, 45));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);
        openButton.setForeground(Color.WHITE);
        openButton.setFocusPainted(false);
        saveButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        openButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        saveButton.setFont(new Font("Consolas", Font.BOLD, 14));
        saveButton.setOpaque(true);
        saveButton.setContentAreaFilled(true);
        openButton.setFont(new Font("Consolas", Font.BOLD, 14));
        openButton.setOpaque(true);
        openButton.setContentAreaFilled(true);

        window.add(openButton);
        window.add(saveButton);


        window.getContentPane().setBackground(new Color(30, 30, 30));

        window.setVisible(true);
    }
}
