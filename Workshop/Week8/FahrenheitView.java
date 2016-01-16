import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class FahrenheitView extends JLabel implements Observer
{
	private TemperatureModel model;
	public FahrenheitView(TemperatureModel model)
	{
		super();
		this.model = model;

		double value = model.getFahrenheit();
		setText(value + " Fahrenheit");

	}

	public void update(Observable obs, Object obj)
	{
		double value = model.getFahrenheit();
		setText(value+ " Fahrenheit");
	}
}