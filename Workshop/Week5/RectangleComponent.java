import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
A component to hold a rectangle
*/ 

public class RectangleComponent extends JComponent
{
	private int xCoord;
	private int yCoord;

	/**
	Construct a component containing a rectangle
	@param xCoord The x coordinate of the top left corner
	@param yCoord The y Coordinate of the top left corner
	*/ 

	public RectangleComponent(int xCoord, int yCoord)
	{
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/** 
	Draw a rectangle
	@param g The graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Rectangle box = new Rectangle(xCoord,yCoord, 200, 100);

		Color c = new Color(0,0,255);
		g2.setColor(Color.RED);
		g2.fill(box);
		g2.setColor(c);
		g2.draw(box); 

		g2.drawString("Here is a rectangle", 150,75);

	}
}