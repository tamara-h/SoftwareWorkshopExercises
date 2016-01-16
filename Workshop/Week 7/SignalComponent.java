import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
Component which draws grey scale map of network signal strength
*/
public class SignalComponent extends JComponent
{

	private Network net;
	private int mapSize;
	private int frameSize;
	private double maxSignal;
	
	/**
	Construct component with specific network and map size
	@param net the network of traqnsmitters
	@param mapSize size of the map
	*/
	public SignalComponent(Network net, int mapSize, int frameSize, double
	maxSignal)
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
		//frameSize = getWidth();
		
		for(int i = 0; i < frameSize; i++)
		{
			for(int j = 0; j < frameSize; j++)
			{
			double x = mapSize * (double)i/frameSize;
			double y = mapSize * (double)j/frameSize; 
			// get signal strength at (i, j)
			double signal = net.getSignal(x, y);
			
			try
			{
				int greyLevel = (int)(255 * signal/maxSignal);
				// create a grey colour using signal strength
				Color grey = new Color(greyLevel, greyLevel, greyLevel);
				g2.setColor(grey);
			}
			catch(IllegalArgumentException e)
			{
				g2.setColor(Color.RED);
			}
			
			
			
			// create pixel at location (i, j)
			Rectangle pixel = new Rectangle(i, j, 1, 1);
			// draw pixel using "fill" method
			g2.fill(pixel);
			}
		}
	}
}
		
			
	
			
	
	
	
	
