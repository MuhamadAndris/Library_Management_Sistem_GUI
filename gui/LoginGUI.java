package gui;

import javax.swing.*;

public class LoginGUI extends LibraryGUI {

    public LoginGUI() {
        JLabel lUsername = new JLabel();
        JLabel lPassword = new JLabel();
        
        // Ini Setingan Jendela Utama
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        lUsername.setText("Masukan Username");
        lPassword.setText("Masukan Username");


        frame.add(lUsername);
        frame.add(lPassword);

    }
}
