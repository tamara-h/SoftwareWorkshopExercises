import javax.swing.JFrame;

public class FrameTest
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(600,400);
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates program on exit
/*
		RectangleComponent comp = new RectangleComponent(100,20);
		frame.add(comp);
		frame.setVisible(true);

*/
		SnowmanComponent comp = new SnowmanComponent(200,50,75);
		frame.add(comp);

		frame.setVisible(true);		
	}
}