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
        saveButton.setBounds(10, 10, 100, 40); 
        saveButton.setBackground(new Color(45, 45, 45));
        saveButton.setForeground(Color.WHITE);
        saveButton.setFocusPainted(false);
        saveButton.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70)));
        saveButton.setFont(new Font("Consolas", Font.BOLD, 14));
        saveButton.setOpaque(true);
        saveButton.setContentAreaFilled(true);

        window.add(saveButton);


        window.getContentPane().setBackground(new Color(30, 30, 30));

        window.setVisible(true);
    }
}
