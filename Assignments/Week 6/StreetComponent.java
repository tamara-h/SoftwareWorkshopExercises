import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
A component to hold a street
*/

public class StreetComponent extends JComponent
{
	private House[] house;
	private int no;

	/**
	Construct a component for a street of houses
	@param xCoord x coordinate of top-left corner
	@param yCoord y coordinate of top left corner
	@param size The width each house
	@param houseNo The number of houses
	*/

	public StreetComponent(double xCoord, double yCoord, double size, int houseNo)
	{
		super();
		this.no = houseNo;
		house = new House[houseNo];
		for (int i=0; i<houseNo; i++)
		{
			house[i] = new House(xCoord+(size*1.5*i), yCoord, size);
		}

	}

	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		for (int i=0; i<no; i++)
		{
			house[i].draw(g2);
		}	
	}
}	



