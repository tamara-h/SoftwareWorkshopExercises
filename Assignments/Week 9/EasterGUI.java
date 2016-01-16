import javax.swing.JFrame;
public class EasterGUI
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Easter Calculator");
		frame.setSize(250,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Easter easter = new Easter(1997);

		EasterComponent panel = new EasterComponent(easter, 1950, 2050, 2000);
		frame.add(panel);
		frame.setVisible(true);
	}

}