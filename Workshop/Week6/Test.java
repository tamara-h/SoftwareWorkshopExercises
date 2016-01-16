import javax.swing.JFrame;
public class Test
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Map of network signal strength");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Network net = new Network();
		Transmitter t1 = new Transmitter(1.0, 3.0, 50);
		Transmitter t2 = new Transmitter(5.0, 6.0, 100);
		Transmitter t3 = new Transmitter(7.0, 8.0, 210);
		Transmitter t4 = new Transmitter(9.0, 2.0, 160);
		net.add(t1);
		net.add(t2);
		net.add(t3);
		net.add(t4);
		SignalComponent comp = new SignalComponent(net, 10, 500, 200);
		frame.add(comp);
		frame.setVisible(true);

	}	
}