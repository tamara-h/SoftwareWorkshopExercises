import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class CelciusView extends JLabel implements Observer
{
	private TemperatureModel model;

	public CelciusView(TemperatureModel model)
	{
		super();
		this.model = model;

		double value = model.getCelcius(); 
		setText(value + " Celcius");

	}

	public void update(Observable obs, Object obj)
	{
		double value = model.getCelcius();
		setText(value+ " Celcius");
	}

}