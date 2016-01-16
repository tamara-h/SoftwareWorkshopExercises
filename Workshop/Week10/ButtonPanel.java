import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel
{
	private NoughtsCrossesModel model;

	public ButtonPanel(NoughtsCrossesModel model)
	{
		super();
		this.model = model;

		JButton reset = new JButton("New Game");

		reset.addActionListener(e->model.newGame());

		JButton exit = new JButton("Exit");

		exit.addActionListener(e->System.exit(0));

		add(reset);
		add(exit);
	}
}