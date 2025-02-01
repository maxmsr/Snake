package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame {
    int boardWidth = 600;
    int boardHeight = 800;

    JFrame frame;
    JButton button;
    JLabel label;
    MyJComponent head = new MyJComponent();

    public Frame() {
        // Initialize JFrame
        frame = new JFrame("Snake");
        frame.setSize(boardWidth, boardHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Required for absolute positioning of components
        frame.setVisible(true);

        // Initialize JButton
        button = new JButton("hello");
        button.setBounds(100, 100, 100, 100); // Set position and size
        frame.add(button);

        label = new JLabel("Score: ");
        label.setBounds(10,10,100,10);
        frame.add(label);
        frame.add(head);
        head.setBounds(20,20,100,100);



    }
    static class MyJComponent extends JComponent {
        public void paint(Graphics g) {
            g.setColor(Color.green);
            g.fillRect(30, 30, 100, 100);
        }
    }

}

