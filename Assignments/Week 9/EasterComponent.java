import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel
{	
	/**
	construct the easter component including the dates and the slider
	*/
	public EasterComponent(Easter easter, int min, int max, int initial)
	{
		EasterModel model = new EasterModel(easter);

		EasterView view = new EasterView(model);

		model.addObserver(view);

		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max-min)/4);
		slider.setPaintLabels(true);
		slider.setMinimum(min);
		slider.setLabelTable(slider.createStandardLabels((max-min)/4));

		SliderListener listen = new SliderListener(model, slider);

		slider.addChangeListener(listen);

		add(view);
		add(slider);

	}
}