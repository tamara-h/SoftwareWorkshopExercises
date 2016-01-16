import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;

public class ControlPanel extends JPanel
{
	private MineModel model; 

	/**
	Creating a panel with each of the buttons on
	@param MineModel the model that the buttons relate to
	*/

	public ControlPanel(MineModel model)
	{
		super();
		this.model = model;


		JButton reset = new JButton("Reset");
		reset.addActionListener(e->model.newGame());

		JButton exit = new JButton("Exit");
		exit.addActionListener(e->System.exit(0));

		//reveal where the mines are

		JButton show = new JButton("Solution");
		show.addActionListener(e->model.showCells());

		//set the difficulty

		JRadioButton easy = new JRadioButton("Easy", true);
		easy.addActionListener(e->model.setLevel(MineSweeper.EASY));

		JRadioButton medium = new JRadioButton("Medium");
		medium.addActionListener(e->model.setLevel(MineSweeper.MEDIUM));

		JRadioButton hard = new JRadioButton("Hard");
		hard.addActionListener(e->model.setLevel(MineSweeper.HARD));

		ButtonGroup bg = new ButtonGroup();
		bg.add(easy);
		bg.add(medium);
		bg.add(hard);

		//setLayout(new BorderLayout());

		add(reset);
		add(exit);
		add(show);
		add(easy);
		add(medium);
		add(hard);
	}
}