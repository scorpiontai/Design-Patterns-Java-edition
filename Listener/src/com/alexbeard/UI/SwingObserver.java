package com.alexbeard.UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingObserver {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserver swingObserver = new SwingObserver();
        swingObserver.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Angel");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Devil");
        }
    }
}
