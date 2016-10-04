
package cecs220_a3_p4;

import javax.swing.*;

public class LinesMain {


    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Random Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Lines panel = new Lines();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
              
    }
    
}
