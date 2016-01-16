import javax.swing.JSlider;
import java.util.Observable;
import java.util.Observer;

public class SliderControl extends JSlider implements Observer
{
	private SunflowerModel model;

	public SliderControl(SunflowerModel model, int min, int max, int inital)
	{
		super(min, max, inital);
		this.model = model;
	}	

	public void update(Observable obs, Object obj)
	{
		setValue((int) (model.getAngle() * 100));


	}
}