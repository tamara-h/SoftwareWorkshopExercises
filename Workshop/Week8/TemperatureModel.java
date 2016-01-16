import java.util.Observable;
import java.util.Observer;

public class TemperatureModel extends Observable
{
	private Temperature temp;
	
	public TemperatureModel(Temperature temp)
	{
		super();
		this.temp = temp;

	}

	public double getCelcius()
	{
		return temp.getCelcius();
	}

	public double getFahrenheit()
	{
		return temp.getFahrenheit();
	}

	public void setCelcius(double celcius)
	{
		temp.setCelcius(celcius);
		setChanged(); //inherited from observable class
		notifyObservers();//alerts views that are observing the model
	}

	public void setFahrenheit(double fahrenheit)
	{
		temp.setFahrenheit(fahrenheit);
		setChanged();
		notifyObservers();
	}

}