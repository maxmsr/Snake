package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        JPanel panel = new JPanel();
        int x = ((int) (Math.random() * 8500)/17);
        int y = (int) (Math.random()*8500)/17;
        panel.setBackground(Color.red);
        panel.setBounds(x,y,85,85);
        frame.add(panel);
 



    }
}