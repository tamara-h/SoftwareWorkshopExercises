import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class SunflowerComponent extends JPanel
{
	public SunflowerComponent(Sunflower flower, int min, int max, int value)
	{
		super();

		//create model
		SunflowerModel model = new SunflowerModel(flower);

		//create views

		SunflowerView view = new SunflowerView(model);

		//create controls and listeners

		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() //THIS IS AN ANNOYMOUS LISTENER
			{
				public void actionPerformed(ActionEvent e)
				{
					model.setAngle(value/100.0);
				}
			}
		);	

		/*
		SliderControl slider = new SliderControl(model, min, max, value);
		slider.addChangeListener( new ChangeListener()
			{
				public void stateChanged(ChangeEvent e)
				{
					int v = slider.getValue();
					model.setAngle(v/100.0);
				}

			}	

		);
		*/
		slider.addChangeListener(e -> model.setAngle((slider.getValue())/100.0));

		//make the views observe the model

		model.addObserver(view);
		model.addObserver(slider);

		//put the views and controls on the panel

		setLayout( new BorderLayout());
		add(view, BorderLayout.CENTER);
		add(slider, BorderLayout.SOUTH);
		add(reset, BorderLayout.EAST);

		
	}
}