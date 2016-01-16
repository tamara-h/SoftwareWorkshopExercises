import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Observer;
import java.awt.GridLayout;
import java.util.Observable;
import javax.swing.text.JTextComponent;

public class BoardView extends JPanel implements Observer
{
	private NoughtsCrossesModel model;
	private JButton[][] cell;

	public BoardView(NoughtsCrossesModel model)
	{
		super();
		this.model = model;

		//create array of buttons

		cell = new JButton[3][3];

		// set layout
		setLayout(new GridLayout(3,3));

		// for each square on the board, create a button, add listener, place it on the panel
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				cell[i][j] = new JButton("");
				final int x = i;
				final int y = j;
				cell[i][j].addActionListener(e->model.turn(x,y));
				add(cell[i][j]);
			}
		}

			
	}

	public void update(Observable obs, Object obj)
	{
		//for each square:
			//if it is a NOUTGTH then put 0 on the button
			//if it is a CROSS then put a x on the button
			//else put " " on the button

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if (model.get(i,j) == NoughtsCrosses.NOUGHT)
				{
					cell[i][j].setText("O");
					cell[i][j].setEnabled(false);
				}
				else if (model.get(i,j)== NoughtsCrosses.CROSS)
				{
					cell[i][j].setText("X");
					cell[i][j].setEnabled(false);
				}
				else
				{
					cell[i][j].setText("");
					boolean notOver = (model.whoWon() == NoughtsCrosses.BLANK);

					cell[i][j].setEnabled(notOver);
					
				}
			}
		}

		repaint();

	}

		

		
	
}