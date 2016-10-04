package Star;
import java.awt.*;
 
public class Star {
 
	private int x;
	private int y;
	private Color color;
	private int size;
 
	public Star (int centerX, int centerY, Color shade, int radius){
 
		x = centerX;
		y = centerY;
		color = shade;
		size = radius;
	}
 
	public void draw (Graphics page){
		page.setColor (color);
 
		page.drawLine (x - size, y + size, x, y - size);
		page.drawLine (x, y - size, x + size, y + size); 
		page.drawLine (x + size, y + size, x - size, y - size/2);
		page.drawLine (x - size, y - size/2, x + size, y - size/2); 
		page.drawLine (x + size, y - size/2,x - size, y + size); 
	}
 
} 


