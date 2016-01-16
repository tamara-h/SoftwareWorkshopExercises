import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class House extends JComponent
{
	private Rectangle2D.Double building;
	private Line2D.Double roof1;
	private Line2D.Double roof2;
	private Rectangle2D.Double door;
	private Rectangle2D.Double window;
	private Ellipse2D.Double window2;
	private Ellipse2D.Double doorknob;
	private Rectangle2D.Double chimney;

	/** 
	Create the house
	*/
	public House(double xCoord, double yCoord, double size)
	{
		building = new Rectangle2D.Double(xCoord, yCoord, size, size);
		roof1 = new Line2D.Double(xCoord, yCoord, xCoord+(0.5*size), yCoord-(0.5*size));
		roof2 = new Line2D.Double(xCoord+(0.5*size), yCoord-(0.5*size), size+xCoord, yCoord);
		door = new Rectangle2D.Double(xCoord+(size*0.5), yCoord+(size*0.5), 0.25*size, 0.5*size);
		window = new Rectangle2D.Double(xCoord+(size*0.125), yCoord+(size*0.5), 0.25*size, 0.25*size);
		window2 = new Ellipse2D.Double(xCoord+(size*0.375), yCoord+(size*0.125), size*0.25, size*0.25);
		doorknob = new Ellipse2D.Double(xCoord+(size*0.55), yCoord+(size*0.75), size*0.05, size*0.05);
		//chimney = new Rectangle2D.Double(xCoord+(size*0.70), yCoord-(size*0.45), 0.1*size, 0.25*size);
	}


	public void draw(Graphics2D g)
	{
	

		Color c = new Color(225, 208, 122);
		g.setColor(c); 
		g.fill(building);
		//g.fill(chimney);

		c = new Color(198, 0, 0);
		g.setColor(c); 
		g.fill(door);

		c = new Color(213, 255, 255);
		g.setColor(c);
		g.fill(window);
		g.fill(window2);
		g.fill(doorknob);

		g.setColor(Color.BLACK);
		g.draw(building);
		g.draw(roof1);
		g.draw(roof2);
		g.draw(door);
		g.draw(window);
		g.draw(window2);
		g.draw(doorknob);
		
	}

}