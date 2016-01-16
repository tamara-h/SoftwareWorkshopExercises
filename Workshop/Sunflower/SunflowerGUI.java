import javax.swing.JFrame;
public class SunflowerGUI
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Sunflower");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Sunflower flower = new Sunflower(800,2.4);

		SunflowerComponent panel = new SunflowerComponent(flower, 0, 314, 240);
		frame.add(panel);
		frame.setVisible(true);
	}	
}