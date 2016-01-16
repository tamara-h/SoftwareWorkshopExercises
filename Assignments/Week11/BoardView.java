import javax.swing.JPanel;
import java.util.Observer;
import java.awt.GridLayout;
import java.util.Observable;
import javax.swing.JButton;

public class BoardView extends JPanel implements Observer
{
	private MineModel model;
	private JButton[][] cell;

	/**
	Creating the board in the gridlayout
	@param MineModel the model to be displayed on the grid
	*/

	public BoardView(MineModel model)
	{
		super();
		this.model = model;

		cell = new JButton[10][10];
		setLayout(new GridLayout(10,10));

		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				cell[i][j] = new JButton(" ");
				final int x = i; final int y = j;
				cell[i][j].addActionListener(e->model.turn(x,y));
				add(cell[i][j]);
			}
		}
	}

	/**
	updates each of the cells depending on their status to display the correct symbol
	*/

	public void update(Observable obs, Object obj)
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(model.get(i,j) == MineSweeper.MINE)
				{
					cell[i][j].setText("X");
					cell[i][j].setEnabled(false);
				}
				else if(model.get(i, j) == MineSweeper.FREE)
				{
					cell[i][j].setText(Integer.toString(model.nearbyMines(i,j)));
					cell[i][j].setEnabled(false);
				}
				else
				{
					cell[i][j].setText("");
					boolean notOver = true;
					if (model.won())
					{
						System.out.println("You've Won!");
						notOver = false;
					}
					cell[i][j].setEnabled(notOver);
				}
			}
		}
		repaint();
	}
	
}