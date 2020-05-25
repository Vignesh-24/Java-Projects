package justlearn1;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Draw extends JComponent {
	public void paintComponent(Graphics g)
	{
	
		g.drawString("Hi Vicky....Welcome!!", 100, 100);
		g.drawRect(100, 200, 300, 200);
	}
	

}
