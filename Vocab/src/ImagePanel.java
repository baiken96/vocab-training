import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{
	
	ImageIcon image;
	
	public void setImage(ImageIcon image)
	{
		
		this.image = image;
		
	}
	
	public ImageIcon getImage()
	{
		
		return this.image;
		
	}
	
	public void paint(Graphics g)
	{

		super.paintComponent(g);		
		g.drawImage(image.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		
	}

}
