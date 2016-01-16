import java.lang.Math;

public class Easter
{
	private int day;
	private int month; 
	private int year;

	/**
	Construct the date for easter for the day and the month
	*/

	public Easter(int year)
	{
		this.year = year;
		double a = year % 19;
		double b = Math.floor(year/100);
		double c = year % 100;
		double d = Math.floor(b/4);
		double e = b % 4;
		double f = Math.floor((b+8)/25);
		double g = Math.floor((b-f+1)/3);
		double h = ((19*a)+b-d-g+15)%30;
		double i = Math.floor(c/4);
		double k = c % 4;
		double l = (32 +(2*e)+(2*i)-h-k)%7;
		double m = Math.floor((a+(11*h)+(22*l))/451);
		this.month = (int) Math.floor((h+l-(7*m)+114)/31);
		this.day = (int) ((h+l-(7*m)+114)%31)+1;

	}

	/**
	the day of easter
	@return the day of easter
	*/
	public int getDay()
	{
		return this.day;
	}

	/** 
	the month of easter
	@return the month of easter
	*/
	public int getMonth()
	{
		return this.month;
	}

	/**
	the year
	@return the year given
	*/
	public int getYear()
	{
		return this.year;
	}

	/**
	Change the year
	@param year the new year
	*/

	public void setYear(int year)
	{
		this.year = year;
		double a = year % 19;
		double b = Math.floor(year/100);
		double c = year % 100;
		double d = Math.floor(b/4);
		double e = b % 4;
		double f = Math.floor((b+8)/25);
		double g = Math.floor((b-f+1)/3);
		double h = ((19*a)+b-d-g+15)%30;
		double i = Math.floor(c/4);
		double k = c % 4;
		double l = (32 +(2*e)+(2*i)-h-k)%7;
		double m = Math.floor((a+(11*h)+(22*l))/451);
		this.month = (int) Math.floor((h+l-(7*m)+114)/31);
		this.day = (int)((h+l-(7*m)+114)%31)+1;
	}
}