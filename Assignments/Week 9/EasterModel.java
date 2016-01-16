import java.util.Observable;
import java.util.Observer;

public class EasterModel extends Observable
{
	private Easter e;

	/**
	Construct the data for EasterModel
	*/

	public EasterModel(Easter e)
	{
		super();
		this.e = e;
	}

	/**
	return the value for the day
	@return day
	*/

	public int getDay()
	{
		return e.getDay();
	}

	/**
	return the value for the month
	@month
	*/

	public int getMonth()
	{
		return e.getMonth();
	}

	/**
	return the value for the year
	@year
	*/
	public int getYear()
	{
		return e.getYear();
	}

	/**
	set the value for the year & notify the observers
	@param year the new year
	*/

	public void setYear(int year)
	{
		e.setYear(year);
		setChanged();
		notifyObservers();
	}
}