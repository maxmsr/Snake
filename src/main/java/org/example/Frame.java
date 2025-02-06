package org.example;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

     Frame(){
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(850,850);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(41, 101, 0));
    }


}