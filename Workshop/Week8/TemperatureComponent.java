import javax.swing.JPanel;
import javax.swing.JSlider;

public class TemperatureComponent extends JPanel
{
	public TemperatureComponent(Temperature temp, int min, int max, int initial)
	{
		super();

		//model

		TemperatureModel model = new TemperatureModel(temp);

		//views

		CelciusView celcius = new CelciusView(model);
		FahrenheitView fahrenheit = new FahrenheitView(model);

		//make the views observe the model

		model.addObserver(celcius);
		model.addObserver(fahrenheit);

		//create the controls

		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max-min)/4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max-min)/4));

		//listeners

		SliderListener listen = new SliderListener(model, slider);

		//make the listeners listen to the control

		slider.addChangeListener(listen);

		//place views and controls on panel

		add(celcius);
		add(slider);
		add(fahrenheit);

		//
	}
}