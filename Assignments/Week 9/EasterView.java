import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	/**
	Construct the EasterView
	*/
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;

		int day = model.getDay();
		int month = model.getMonth();
		int year = model.getYear();
		JLabel label = new JLabel("Easter is on " +day+"/"+month+"/"+year);
	}

	/**
	update the output of the system with the new date 
	@param obs Observable
	@param obj the object
	*/

	public void update(Observable obs, Object obj)
	{
		int day = model.getDay();
		int month = model.getMonth();
		int year =model.getYear();
		setText("Easter is on " +day+"/"+month+"/"+year);
	}
}