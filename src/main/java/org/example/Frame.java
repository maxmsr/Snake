package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    JButton button = new JButton("Hello");

     Frame(){
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(850,850);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(41, 101, 0));
        //button.setBounds(100,500,100,50);
        button.addActionListener(e -> System.out.println("H"));
        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    /*
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== button){
             System.out.println("H");
         }

    }

     */
}