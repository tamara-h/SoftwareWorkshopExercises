import javax.swing.JSlider;
import javax.swing.event.*;

public class SliderListener implements ChangeListener
{
	private EasterModel model;
	private JSlider slider; 
	/**
	Create the sliderlistener with the slider and the given model for easter
	*/

	public SliderListener(EasterModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}

	/**
	get the value from the slider and update the rest of the program to be in accordance
	@param e the new event, the slider being moved
	*/
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setYear(value);
	}
}