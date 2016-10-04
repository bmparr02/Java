
package cecs220_a3_p4;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Lines extends JPanel
    {
        private int x0;
        private int x;
        private int y0;
        private int y;
        private Random number;
        private int length;
        
        public Lines()
                {
                    number = new Random();
                    setPreferredSize(new Dimension(600, 600));
                    setBackground(Color.ORANGE);
                }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            x0 = 20;
            y0 = 20;
            
            for( int i = 0; i < 100; i++)
            {
                length = number.nextInt(500) + 1;
                x = x0 + length;
                y = y0;
                g.setColor(Color.MAGENTA);
                g.drawLine(x0, y0, x, y);
                y0 += 5;
                
            }
        }
}
