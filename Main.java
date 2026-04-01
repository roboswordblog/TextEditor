import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    manageMent manage = new manageMent();
    JFrame window = new JFrame("Coding IDE");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(800, 600);
    window.setLocationRelativeTo(null);
    window.setResizable(false);

    window.setLayout(null);

    JButton saveButton = new JButton("Save");
    JButton openButton = new JButton("Load");
    saveButton.setBounds(210, 10, 100, 40);
    openButton.setBounds(310, 10, 100, 40);
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

    saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        saveButton.setBackground(new Color(70, 70, 70)); // lighter gray on hover
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        saveButton.setBackground(new Color(45, 45, 45)); // revert color
      }
    });
    openButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        openButton.setBackground(new Color(70, 70, 70)); // lighter gray on hover
      }

      public void mouseExited(java.awt.event.MouseEvent evt) {
        openButton.setBackground(new Color(45, 45, 45)); // revert color
      }
    });


    window.add(openButton);
    window.add(saveButton);
    JTextField fileName = new JTextField(20);
    fileName.setSize(150, 50);
    fileName.setLocation(50, 5);
    fileName.setBackground(new Color(50, 50, 50)); // dark gray
    fileName.setForeground(Color.WHITE);          // white text
    fileName.setCaretColor(Color.WHITE);          // caret color
    fileName.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
    fileName.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font
    window.add(fileName);
    window.getContentPane().setBackground(new Color(30, 30, 30));


    JTextArea contentArea = new JTextArea(manage.fileStringy);
    contentArea.setBackground(new Color(30, 30, 30)); // dark background
    contentArea.setForeground(Color.WHITE);           // white text
    contentArea.setCaretColor(Color.WHITE);           // cursor color
    contentArea.setFont(new Font("Consolas", Font.PLAIN, 14));
    contentArea.setLineWrap(true);                    // wrap long lines
    contentArea.setWrapStyleWord(true);

    JScrollPane content = new JScrollPane(contentArea);
    content.setBounds(100, 100, 600, 400);
    content.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // optional border

    window.add(content);
    window.setVisible(true);
  }
}
