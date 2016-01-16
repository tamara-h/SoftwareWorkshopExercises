import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D; 

/**
	Snowman grapics
*/
public class Snowman
{
	private Ellipse2D.Double head;
	private Ellipse2D.Double body;
	private Line2D.Double arm1;
	private Line2D.Double arm2; 
	private Ellipse2D.Double eye1;
	private Ellipse2D.Double eye2;
	private Ellipse2D.Double nose;
	private Ellipse2D.Double button1;



	/**
	Create snowman parts
	@param xCoord The x coordinate of head
	@param yCoord The y coordinate of head
	@param headSize The size of the head
	*/
	public Snowman(int xCoord, int yCoord, int headSize)
	{
		this.head = new Ellipse2D.Double(xCoord, yCoord, headSize, headSize);
		this.body = new Ellipse2D.Double((xCoord-headSize ), (yCoord + headSize), (headSize *3), (headSize *3));
		this.arm1 = new Line2D.Double(xCoord-headSize, yCoord+2.5*headSize, xCoord - 2*headSize, yCoord + 2.5*headSize);
		this.arm2 = new Line2D.Double(xCoord+3*headSize, yCoord+2.5*headSize, xCoord - 2*headSize, yCoord + 2.5*headSize);
		this.eye1 = new Ellipse2D.Double(xCoord+0.15*headSize, yCoord+0.25*headSize, headSize/4, headSize/4);
		this.eye2 = new Ellipse2D.Double(xCoord+0.65*headSize, yCoord+0.25*headSize, headSize/4, headSize/4);
		this.nose = new Ellipse2D.Double(xCoord+0.35*headSize, yCoord+0.5*headSize, headSize/3, headSize/3);
		this.button1 = new Ellipse2D.Double(xCoord+0.35, yCoord+)
	}

	/**
	Draw the snowman on a graphics object
	*/
	public void draw(Graphics2D g)
	{
		g.setColor(Color.BLACK);
		g.draw(arm1);
		g.draw(arm2);

		g.setColor(Color.WHITE);
		g.fill(head);
		g.fill(body);
		g.setColor(Color.BLACK);
		g.fill(eye1);
		g.fill(eye2);
		g.draw(head);
		g.draw(body);
		g.draw(nose);
		Color orange = new Color(225,165,0);
		g.setColor(orange);
		g.fill(nose);


	}
}