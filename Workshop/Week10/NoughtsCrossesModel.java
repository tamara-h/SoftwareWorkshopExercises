import java.util.Observable;
public class NoughtsCrossesModel extends Observable
{
	private NoughtsCrosses nc;

	/**
	Construct the model of the game
	@param nc the noughtsCrosses object
	*/

	public NoughtsCrossesModel(NoughtsCrosses nc)
	{
		super();
		this.nc = nc;
	}

	/**
	Get symbol at given location
	@param i the row
	@param j the column
	@return the symbol at that location
	*/
	public int get(int i, int j)
	{
		return nc.get(i,j);
	}

	/**
	Is it cross's turn?
	@return true if it is crosses turn, false if it is noughts turn
	*/

	public boolean isCrossTurn()
	{
		return nc.isCrossTurn();
	}

	/**
	Let the player whos turn it is play at a particular location
	@param i the row
	@param j the column
	*/

	public void turn(int i, int j)
	{
		nc.turn(i,j);
	}

	/**
	Determine who (if anyone) has won
	@return CROSS if cross has won, NOUGHT if nought has won, otherwise BLANK
	*/

	public int whoWon()
	{
		return nc.whoWon();
	}

	/**
	Start a new game
	*/

	public void newGame()
	{
		nc.newGame();
		setChanged();
		notifyObservers();
	}








}