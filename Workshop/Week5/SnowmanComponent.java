import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
A component to hold a snowman
*/

public class SnowmanComponent extends JComponent
{
	private Snowman frosty;
	private int xCoord;
	private int yCoord;

	/**
	Create snowman parts
	@param xCoord The x coordinate of head
	@param yCoord The y coordinate of head
	@param headSize The size of the head
	*/
	public SnowmanComponent(int xCoord, int yCoord, int headSize)
	{
		super();
		this.frosty = new Snowman(xCoord, yCoord, headSize);
	}

	/**
	Draw the snowman
	@param g The graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		frosty.draw(g2);

	}
	


}	