package org.example;

import javax.swing.*;

public class Frame {
    int boardWidth = 600;
    int boardHeight = 800;

    JFrame frame;
    JButton button;

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
    }

}