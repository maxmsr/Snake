package org.example;

import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame {

    public Frame()    {
        setSize( 900, 900 );
        setVisible( true );
    }
    public void paint( Graphics g )
    {
        for ( int x = 10; x <= 850; x += 50 )
            for ( int y = 40; y <= 850; y += 50 )
                g.drawRect( x, y, 50, 50 );

    }
}