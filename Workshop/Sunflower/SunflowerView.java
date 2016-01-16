import java.util.Observer;
import java.util.Observable;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SunflowerView extends JPanel implements Observer
{

	private SunflowerModel model;

	//attributes

	//constructor
	public SunflowerView(SunflowerModel model)
	{
		super();
		this.model = model;
	}

	//paintcomponent

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;

		int height = getHeight();
		int width = getWidth();
		double diameter = Math.min(height, width);


		g2.clearRect(0,0, width, height);

		//set colour
		g2.setColor(Color.ORANGE);

		//get list of coordinates

		ArrayList<Point2D.Double> seeds = model.getSeeds();

		//iterate through the list 
		for(int i=0;i<seeds.size();i++)
		{
			//get x and y coords *diameter to work out where to be
			double x = seeds.get(i).getX();
			double y = seeds.get(i).getY();
			//create a spot object at that location
			Spot p = new Spot(x * diameter, y*diameter, 0.01 *diameter); 
			//draw spot
			g2.fill(p);
		}
		
	}

	//update
	public void update(Observable obs, Object obj)
	{
		repaint();
	}
}



