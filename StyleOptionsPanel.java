
package cecs220_a3_p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class StyleOptionsPanel extends JPanel
{
    private JLabel saying;
    private JCheckBox bold, italic;
    private JTextField txtFont;
    int style = Font.PLAIN;
    int fontSize;

    public StyleOptionsPanel()
    {
        txtFont = new JTextField(10);
        txtFont.setText("20");
        saying = new JLabel("I Love CECS 220!!!");
        saying.setFont(new Font("Helvetica", style, Integer.parseInt(txtFont.getText())));
        
        TextListener txtlistener = new TextListener();
        txtFont.addActionListener(txtlistener);
        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);
        italic = new JCheckBox ("Italic");
        italic.setBackground (Color.cyan);
        
        StyleListener listener = new StyleListener();
        bold.addItemListener (listener);
        italic.addItemListener (listener);
        
        add(saying);
        add(bold);
        add(italic);
        
        add(new JLabel("Enter the desired font size"));
        add(txtFont);
        
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500, 300));
        
    }
        private class TextListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                if (bold.isSelected())
                    style = Font.BOLD;
                if (italic.isSelected())
                    style += Font.ITALIC;
                
                fontSize = Integer.parseInt(txtFont.getText());
                saying.setFont(new Font("Helvetica", style, fontSize));
                
            }
        }
        
        private class StyleListener implements ItemListener
        {
            @Override
            public void itemStateChanged (ItemEvent event)
            {
                if (bold.isSelected())
                    style = Font.BOLD;
                if (italic.isSelected())
                    style += Font.ITALIC;
                fontSize = Integer.parseInt(txtFont.getText());
                saying.setFont(new Font("Helvetica", style, fontSize));
            }
        }

    
}
