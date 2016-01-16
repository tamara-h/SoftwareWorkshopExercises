/**
Converting between celcius and fahrenheit
*/

import java.lang.Math;

public class Temperature
{
	private double celcius;
	private double fahrenheit;


	/**
	Construct temperature in degrees celcius
	*/
	public Temperature(double celcius)
	{
		this.celcius = celcius;
		this.fahrenheit = (double)Math.round((1.8 * celcius + 32.0)*10)/10;
	}
	
	/**
	temperature in celcius
	@return temperature in celcius
	*/
	public double getCelcius()
	{
		return celcius;
	}
	
	
	/**
	temperature in fahrenheit
	@return temperature in fahrenheit
	*/
	public double getFahrenheit()
	{
		return fahrenheit;
	}
	
	
	/**
	change temperature (celcius)
	@param celcius new temperature in celcius
	*/
	public void setCelcius(double celcius)
	{
		this.celcius = celcius;
		this.fahrenheit = (double)Math.round((1.8 * celcius + 32.0)*10)/10;
	}


	/**
	change temperature (fahrenheit)
	@param fahrenheit new temperature in fahrenheit
	*/
	public void setFahrenheit(double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
		this.celcius = (fahrenheit - 32.0) / 1.8;
	}
}
