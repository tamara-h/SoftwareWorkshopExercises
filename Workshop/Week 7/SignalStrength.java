import javax.swing.JFrame;

public class SignalStrength
{
	public static void main(String[] args)
	{
	
		Transmitter t1 = new Transmitter(1.0, 0.5, 80.0);
		Transmitter t2 = new Transmitter(8.0, 2.0, 180.0);
		Transmitter t3 = new Transmitter(7.5, 7.0, 180.0);
		Transmitter t4 = new Transmitter(7.5, 1.0, 280.0);
		Transmitter t5 = new Transmitter(7.5, 6.0, 280.0);
		Transmitter t6 = new Transmitter(5.0, 5.0, 180.0);
		
		Network net = new Network();
		net.add(t1);
		net.add(t2);
		net.add(t3);
		net.add(t4);
		net.add(t5);
		net.add(t6);
		
		JFrame frame = new JFrame("Map of network signal strength");
		
		int frameSize = 300;
		frame.setSize(frameSize, frameSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int mapSize = 10;
		SignalComponent comp = new SignalComponent(net, mapSize, frameSize,
		300);
		frame.add(comp);
		frame.setVisible(true);
	}
}
		
		
		
