import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MineComponent extends JPanel
{
	/**
	puts the board and the buttons on the same component
	*/
	public MineComponent(MineSweeper game)
	{
		super();
		MineModel model = new MineModel(game);

		BoardView board = new BoardView(model);
		ControlPanel controls = new ControlPanel(model);

		model.addObserver(board);

		setLayout(new BorderLayout());
		
		add(board, BorderLayout.CENTER);
		add(controls, BorderLayout.SOUTH);
	}
}