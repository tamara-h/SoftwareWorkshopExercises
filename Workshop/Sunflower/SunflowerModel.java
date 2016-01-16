import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.awt.geom.Point2D;

public class SunflowerModel extends Observable
{
	private Sunflower s;

	/**
	Construct the data for a Sunflower
	*/
	
	public SunflowerModel(Sunflower s)
	{
		super();
		this.s = s;
	}

	/**
	get the arraylist of the seeds
	@return year
	*/
	public ArrayList<Point2D.Double> getSeeds()
	{
		return s.getSeeds();
	}

	/**
	return the angle that the sunflower is currently using
	@return angle
	*/	

	public double getAngle()
	{
		return s.getAngle();
	}

	/**
	set the value for the angle of the seeds & notify the observers
	@param angle the new angle
	*/

	public void setAngle(double angle)
	{
		s.setAngle(angle);
		setChanged();
		notifyObservers();
	}

}	