import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;

public class SignalComponent extends JComponent
{
	
	private Network net;
	private int mapSize;
	private int frameSize;
	private double maxSignal;


	public SignalComponent(Network net, int mapSize, int frameSize, int maxSignal)
	{
		super();
		this.net = net;
		this.mapSize = mapSize;
		this.frameSize = frameSize;
		this.maxSignal = maxSignal;
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		frameSize = getWidth();
		for(int i=0; i<frameSize; i++)
		{
			for(int j=0; j<frameSize; j++)
			{	
				// find coordinates
				double x = ((double) i/frameSize)*mapSize;
				double y = ((double) j/frameSize)*mapSize;
				//calculate Signal
				double signal = net.getSignal(x,y);
				//calculate grey level
				int greyLevel = (int) (255 * signal/maxSignal);
				//set color
				try
				{
					Color c = new Color(greyLevel, greyLevel, greyLevel);
					g2.setColor(c);
				}
				catch(IllegalArgumentException e)
				{
					g2.setColor(Color.RED);
				}
				//draw the rectangle
				Rectangle pixel = new Rectangle(i,j,1,1);
				g2.fill(pixel);
			}
		}
	}	



}