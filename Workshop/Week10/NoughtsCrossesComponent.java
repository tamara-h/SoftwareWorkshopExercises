import javax.swing.JPanel;
import java.awt.BorderLayout;
public class NoughtsCrossesComponent extends JPanel
{
	
	public NoughtsCrossesComponent(NoughtsCrosses oxo)
	{
		super();

		NoughtsCrossesModel model = new NoughtsCrossesModel(oxo);
		BoardView view = new BoardView(model);
		ButtonPanel bp = new ButtonPanel(model);

		model.addObserver(view);
		//model.addObserver(bp);

		setLayout(new BorderLayout());
		add(view, BorderLayout.CENTER);
		add(bp, BorderLayout.SOUTH);

	}
}