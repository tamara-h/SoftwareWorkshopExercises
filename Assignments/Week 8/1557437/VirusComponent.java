import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;

/**
Component to hold the virus
*/
public class VirusComponent extends JComponent
{
	private double[] proportion;
	private int size;
	private int xlength;
	private double x;
	private double y;
	private Line2D.Double xAxis;
	private Line2D.Double yAxis;

	/**
	Construct a component for the virus
	@param proportion An array of the proportion of a population infected
	@param size the frame size
	*/

	public VirusComponent(double[] proportion, int size)
	{
		super();
		this.proportion = proportion;
		this.size = size;
		
	}

	/**
	Paint component on a graphics object
	@param g the graphics object
	*/

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		xlength = getWidth();
		size = getHeight();
		x= 0 + size/05;
		y = size - size/05;
		yAxis = new Line2D.Double(x,y, x, size/05);
		xAxis = new Line2D.Double(x,y,(xlength-xlength/10), y);

		g2.draw(xAxis);
		g2.draw(yAxis);
		//System.out.println(size/055);
		g2.drawString("Infections", (int) x-size/20, (int) size/6);
		g2.drawString("Time", (int) x+((xlength-xlength/10)/3),(int) y+size/20);
		int arraysize = proportion.length;
		for(int i=0; i<arraysize; i++)
		{
			//System.out.println(proportion[i]);
			double plot = y - (proportion[i]*size/2);
			//System.out.println(plot);
			Rectangle2D.Double pixel = new Rectangle2D.Double(x,plot,1,1);
			g2.fill(pixel);
			x = x + xlength/arraysize;

			//UNSURE ON WHY THE GRAPH DOESNT MOVE
		}
		
	}	

}