import java.util.Observable;
public class MineModel extends Observable
{
	private MineSweeper ms;

	/**
	Construct the model of the game
	@param ms the MineSweeper object
	*/ 

	public MineModel(MineSweeper ms)
	{
		super();
		this.ms = ms;
	}

	/**
	Get symbol at given location
	@param i the row
	@param j the column
	@return the symbol at that location
	*/
	public int get(int i, int j)
	{
		return ms.get(i,j);
	}

	/**
	Get the number of mines on the board
	@return the number of mines
	*/

	public int getMinesNo()
	{
		return ms.getMinesNo();
	}

	/**
	Get the level that the board is currently on
	@return the level 
	*/

	public int getLevel()
	{
		return ms.getLevel();
	}

	/**
	Set the level
	@param level the level to set to
	*/

	public void setLevel(int level)
	{
		ms.setLevel(level);
	}

	/**
	Set the turn
	@param i the x coord
	@param j the y coord
	*/
	public void turn(int i, int j)
	{
		ms.turn(i,j);
		setChanged();
		notifyObservers();
	}

	/**
	returns the number of mines nearby
	@param i the x coord
	@param j the y coord
	@return number of mines
	*/
	public int nearbyMines(int i, int j)
	{
		return ms.nearbyMines(i,j);
	}

	/**
	return if the player has won or not
	@return if they have won
	*/

	public boolean won()
	{
		return ms.won();
	}

	/**
	Show all cells
	*/

	public void showCells()
	{
		ms.showCells();
		setChanged();
		notifyObservers();
	}

	/**
	Start a new game
	*/
	public void newGame()
	{
		ms.newGame();
		setChanged();
		notifyObservers();
	}



}