
package cecs220_a3_p2;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptions {

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Style Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StyleOptionsPanel panel = new StyleOptionsPanel();
        frame.getContentPane().add (panel);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
