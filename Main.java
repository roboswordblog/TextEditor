import javax.swing.*;
import java.awt.*;

class Main {
    static manageMent dataManage = new manageMent();
    static void landing(){
        JFrame window = new JFrame("LibApp");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);
        JLabel title = new JLabel();
        title.setText("Lib App");
        title.setFont(new Font("Serif", Font.BOLD, 75));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(275, 30, 300, 100);
        JLabel subtitle = new JLabel();
        subtitle.setText("The best library app there is.-Someone Very Smart");
        subtitle.setFont(new Font("Serif", Font.ITALIC, 15));
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setBounds(250, 105, 350, 100);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(275, 200, 100, 45);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(true);
        loginButton.setOpaque(true);
        loginButton.setBackground(new Color(0, 122, 255));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(10, 140, 255));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 122, 255));
            }
        });
        loginButton.addActionListener(e -> {
            window.dispose(); // close current window
            login();          // open login screen
        });

        JButton signupButton = new JButton("Signup");
        signupButton.setForeground(Color.WHITE);
        signupButton.setFocusPainted(false);
        signupButton.setBorderPainted(false);
        signupButton.setContentAreaFilled(true);
        signupButton.setOpaque(true);
        signupButton.setBounds(400, 200, 100, 45);
        signupButton.setBackground(new Color(46, 204, 113));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(46, 204, 113));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(70, 220, 130));
            }
        });
        signupButton.addActionListener(e -> {
            window.dispose(); // close current window
            signup();          // open login screen
        });
        window.add(title);
        window.add(subtitle);
        window.add(loginButton);
        window.add(signupButton);

        window.getContentPane().setBackground(new Color(18, 18, 20));
        window.setVisible(true);
    }
    static void signup(){
        JFrame window = new JFrame("LibApp Signup");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);
        JLabel title = new JLabel();
        title.setText("Lib App");
        title.setFont(new Font("Serif", Font.BOLD, 75));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(275, 30, 300, 100);
        JLabel subtitle = new JLabel();
        subtitle.setText("Sign Up");
        subtitle.setFont(new Font("Serif", Font.PLAIN, 30));
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setBounds(340, 105, 350, 100);

        JTextField username = new JTextField("Username");
        username.setSize(300, 50);
        username.setLocation(265, 225);
        username.setBackground(new Color(50, 50, 50)); // dark gray
        username.setForeground(Color.WHITE);          // white text
        username.setCaretColor(Color.WHITE);          // caret color
        username.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        username.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font

        window.add(username);
        window.getContentPane().setBackground(new Color(30, 30, 30));
        JTextField password = new JTextField("Password");
        password.setSize(300, 50);
        password.setLocation(265, 300);
        password.setBackground(new Color(50, 50, 50)); // dark gray
        password.setForeground(Color.WHITE);          // white text
        password.setCaretColor(Color.WHITE);          // caret color
        password.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        password.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font

        window.add(password);


        JButton signupButton = new JButton("Signup");
        signupButton.setForeground(Color.WHITE);
        signupButton.setFocusPainted(false);
        signupButton.setBorderPainted(false);
        signupButton.setContentAreaFilled(true);
        signupButton.setOpaque(true);
        signupButton.setBounds(350, 400, 100, 45);
        signupButton.setBackground(new Color(46, 204, 113));
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(46, 204, 113));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupButton.setBackground(new Color(70, 220, 130));
            }
        });
        signupButton.addActionListener(e -> {
            window.dispose(); // close current window
            home();          // open login screen
        });
        window.add(title);
        window.add(subtitle);
        window.add(signupButton);

        window.getContentPane().setBackground(new Color(18, 18, 20));
        window.setVisible(true);
    }
    static void login(){
        JFrame window = new JFrame("LibApp Login");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);
        JLabel title = new JLabel();
        title.setText("Lib App");
        title.setFont(new Font("Serif", Font.BOLD, 75));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(275, 30, 300, 100);
        JLabel subtitle = new JLabel();
        subtitle.setText("Login");
        subtitle.setFont(new Font("Serif", Font.PLAIN, 30));
        subtitle.setForeground(new Color(255, 255, 255));
        subtitle.setBounds(340, 105, 350, 100);

        JTextField username = new JTextField("Username");
        username.setSize(300, 50);
        username.setLocation(265, 225);
        username.setBackground(new Color(50, 50, 50)); // dark gray
        username.setForeground(Color.WHITE);          // white text
        username.setCaretColor(Color.WHITE);          // caret color
        username.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        username.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font

        window.add(username);
        window.getContentPane().setBackground(new Color(30, 30, 30));
        JTextField password = new JTextField("Password");
        password.setSize(300, 50);
        password.setLocation(265, 300);
        password.setBackground(new Color(50, 50, 50)); // dark gray
        password.setForeground(Color.WHITE);          // white text
        password.setCaretColor(Color.WHITE);          // caret color
        password.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        password.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font

        window.add(password);


        JButton loginButton = new JButton("Login");
        loginButton.setBounds(350, 400, 100, 45);

        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(true);
        loginButton.setOpaque(true);
        loginButton.setBackground(new Color(0, 122, 255));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(10, 140, 255));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(0, 122, 255));
            }
        });
        loginButton.addActionListener(e -> {
            window.dispose(); // close current window
            if (dataManage.passwordCorrect(username.getText(), password.getText())){
                home();
            }
            else{
                login();
            }          // open login screen
        });
        window.add(title);
        window.add(subtitle);
        window.add(loginButton);

        window.getContentPane().setBackground(new Color(18, 18, 20));
        window.setVisible(true);
    }

    static void home(){
        JFrame window = new JFrame("LibApp Login");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);
        JLabel title = new JLabel();
        title.setText("Lib App");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(30, 30, 300, 100);

        JLabel holdLabel = new JLabel();
        holdLabel.setText("Holds");
        holdLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        holdLabel.setForeground(new Color(255, 255, 255));
        holdLabel.setBounds(130, 150, 300, 100);
        JLabel haveLabel = new JLabel();
        haveLabel.setText("Checked Out");
        haveLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        haveLabel.setForeground(new Color(255, 255, 255));
        haveLabel.setBounds(430, 150, 300, 100);


        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(650, 50, 100, 50);

        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFocusPainted(false);
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(true);
        logoutButton.setOpaque(true);
        logoutButton.setBackground(new Color(231, 76, 60));

        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(new Color(255, 99, 71));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(new Color(231, 76, 60));
            }
        });
        logoutButton.addActionListener(e -> {
            window.dispose(); // close current window
            landing();          // open login screen
        });

        JTextField search = new JTextField("Search");
        search.setSize(200, 50);
        search.setLocation(300, 50);
        search.setBackground(new Color(50, 50, 50));
        search.setForeground(Color.WHITE);          // white text
        search.setCaretColor(Color.WHITE);          // caret color
        search.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        search.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font


        JButton searchButton = new JButton("Search");
        searchButton.setBounds(500, 50, 100, 50);

        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(true);
        searchButton.setOpaque(true);
        searchButton.setBackground(new Color(10, 140, 255));

        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButton.setBackground(new Color(100, 130, 255));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButton.setBackground(new Color(10, 140, 255));
            }
        });
        logoutButton.addActionListener(e -> {
            window.dispose();
            landing();
        });
        searchButton.addActionListener(e -> {
            window.dispose();
            searchPage();
        });

        window.add(title);
        window.add(logoutButton);
        window.add(search);
        window.add(searchButton);
        window.add(holdLabel);
        window.add(haveLabel);
        window.getContentPane().setBackground(new Color(18, 18, 20));
        window.setVisible(true);
    }
    static void searchPage(){
        JFrame window = new JFrame("LibApp Login");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setLayout(null);
        JLabel title = new JLabel();
        title.setText("Lib App");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(30, 30, 300, 100);


        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(650, 50, 100, 50);

        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFocusPainted(false);
        logoutButton.setBorderPainted(false);
        logoutButton.setContentAreaFilled(true);
        logoutButton.setOpaque(true);
        logoutButton.setBackground(new Color(231, 76, 60));

        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(new Color(255, 99, 71));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButton.setBackground(new Color(231, 76, 60));
            }
        });
        logoutButton.addActionListener(e -> {
            window.dispose(); // close current window
            landing();          // open login screen
        });

        JTextField search = new JTextField("Search");
        search.setSize(200, 50);
        search.setLocation(300, 50);
        search.setBackground(new Color(50, 50, 50));
        search.setForeground(Color.WHITE);          // white text
        search.setCaretColor(Color.WHITE);          // caret color
        search.setBorder(BorderFactory.createLineBorder(new Color(70, 70, 70))); // subtle border
        search.setFont(new Font("Consolas", Font.PLAIN, 14)); // IDE-style font


        JButton searchButton = new JButton("Search");
        searchButton.setBounds(500, 50, 100, 50);

        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(true);
        searchButton.setOpaque(true);
        searchButton.setBackground(new Color(10, 140, 255));

        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButton.setBackground(new Color(100, 130, 255));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButton.setBackground(new Color(10, 140, 255));
            }
        });
        logoutButton.addActionListener(e -> {
            window.dispose(); // close current window
            landing();          // open login screen
        });

        window.add(title);
        window.add(logoutButton);
        window.add(search);
        window.add(searchButton);
        window.getContentPane().setBackground(new Color(18, 18, 20));
        window.setVisible(true);
    }

    public static void main(String[] args) {
        landing();
    }
}
