import javax.swing.JFrame;
public class VirusViewer
{
	public static void main(String[] args)
	{
		int size = 600;
		Population p1 = new Population(size, 0.1, 0.7, 0.5);
		double[] proportion = new double[size];

		for(int i=0; i<size; i++)
		{
			p1.update();
			proportion[i] = p1.proportionInfected();
			//System.out.println(proportion[i]);
		}

		JFrame frame = new JFrame("Graph of proportion infected");
		int fsize = 700;
		int x = 2*(size/05) + proportion.length;
		frame.setSize(x,fsize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		VirusComponent vir = new VirusComponent(proportion, fsize);
		frame.add(vir);
		frame.setVisible(true);

	}	
}