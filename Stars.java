package Star;

import java.awt.*;
import java.applet.Applet;


public class Stars extends Applet {

private final int awidth = 400;
private final int aheight = 150;
private final int rmin = 10;
private final int var = 50;

private Star star1, star2, star3, star4;

public void init (){
int r1,r2,r3,r4; 

r1 = (int) (Math.random() * var) + rmin;
r2 = (int) (Math.random() * var) + rmin;
r3 = (int) (Math.random() * var) + rmin;
r4 = (int) (Math.random() * var) + rmin;

star1 = new Star (50,75, Color.green, r1);
star2 = new Star (70,75, Color.red, r2);
star3 = new Star (125,75, Color.yellow, r3);
star4 = new Star (150,75, Color.blue, r4);

setBackground (Color.black);
setSize (awidth, aheight);
}

public void paint(Graphics page) {

star1.draw (page);
star2.draw (page);
star3.draw (page);
star4.draw (page);
}
}
