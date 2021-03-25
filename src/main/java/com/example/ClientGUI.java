package com.example;

import javax.swing.*;

public class ClientGUI {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClientGUIForm clientGUIForm = new ClientGUIForm();
                clientGUIForm.setVisible(true);
            }
        });
    }
}
