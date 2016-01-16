import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
A component to hold the house
*/

public class HouseComponent extends JComponent
{
	private House house;

	/**
	Construct a component with specified coordinates for house location
	@param xCoord x coordinate of top-left corner
	@param yCoord y coordinate of top left corner
	@param size The width of the house
	*/
	public  HouseComponent(double xCoord, double yCoord, double size)
	{
		super();
		house = new House(xCoord, yCoord, size);

	}

	/**
	Draws the house
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		house.draw(g2);

	}

}