import javax.swing.JOptionPane;
public class MineSweeper
{
	public static final int BLANK = 0;
	public static final int MINE = 1;
	public static final int FREE = 2;
	public static final int HIDDENMINE = 3;

	public static final int EASY = 10;
	public static final int MEDIUM = 15;
	public static final int HARD = 20;
	
	/** 
	Creating the state of the game
	*/
	private int[][] board;
	private int mineNo;
	private int level;

	public MineSweeper()
	{
		this.mineNo = 10;
		this.level = EASY;
		this.board = new int[10][10];
		

		newGame();

	}

	/**
	Get symbol at given location
	@param i the row
	@param j the column
	@return the symbol at that location
	*/
	public int get(int i, int j)
	{
		return board[i][j];
	}

	/**
	Get the number of mines on the board
	@return the number of mines
	*/

	public int getMinesNo()
	{
		return this.mineNo;
	}

	/**
	Get the level that the board is currently on
	@return the level 
	*/

	public int getLevel()
	{
		return this.mineNo;
	}

	/**
	Set the level
	@param level the level to set to
	*/

	public void setLevel(int level)
	{
		this.mineNo = level;
	}

	/**
	Set the turn
	@param i the x coord
	@param j the y coord
	*/

	public void turn(int i, int j)
	{
		if((board[i][j] == BLANK) || (board[i][j] == HIDDENMINE))
		{
			if (board[i][j] == HIDDENMINE)
			{
				board[i][j] = MINE;
				System.out.println("You Lose!");
			}
			else 
			{
				board[i][j] = FREE;
			}
		}
	}

	/**
	returns the number of mines nearby
	@param i the x coord
	@param j the y coord
	@return number of mines
	*/
	public int nearbyMines(int i, int j)
	{
		int c = 0;
		//test if the clicked is the corners
		if ((i==0) && (j==0))
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j+1] == MINE) || (board[i+1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}			
		}
		else if ((i ==9) && (j==0))
		{
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j+1] == MINE) || (board[i-1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}			
		}
		else if ((i==0) && (j==9))
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j-1] == MINE) || (board[i+1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}	
		}
		else if ((i == 9) && (j==9))
		{
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j-1] == MINE) || (board[i-1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
		}


		//test if the clicked is on the edges
		//x=0 edge
		else if ((i==0) && (j!=0) && (j!=10))
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j+1] == MINE) || (board[i+1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j-1] == MINE) || (board[i+1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}		
		}
		//y=0 edge
		else if ((j==0) && (i!=0) && (i!=10))
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j+1] == MINE) || (board[i+1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j+1] == MINE) || (board[i-1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}		
		}
		//xmax edge
		else if ((i==9) && (j!=0) && (j!=10))
		{
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j-1] == MINE) || (board[i-1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j+1] == MINE) || (board[i-1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}		
		}
		//ymax edge
		else if ((j==9) && (i!=0) && (i!=10))
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j-1] == MINE) || (board[i-1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j-1] == MINE) || (board[i+1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
		}
		//if in the middle
		else
		{
			if ((board[i+1][j] == MINE) || (board[i+1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j+1] == MINE) || (board[i+1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j] == MINE) || (board[i-1][j] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j-1] == MINE) || (board[i-1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j+1] == MINE) || (board[i][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i][j-1] == MINE) || (board[i][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i+1][j-1] == MINE) || (board[i+1][j-1] == HIDDENMINE))
			{
				c = c+1;
			}
			if ((board[i-1][j+1] == MINE) || (board[i-1][j+1] == HIDDENMINE))
			{
				c = c+1;
			}
		}

		

		

		return c;
	}




	/**
	return if the player has won or not
	@return if they have won
	*/

	public boolean won()
	{
		int c = 0;
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if ((board[i][j] == HIDDENMINE) || (board[i][j] == FREE))
				{
					c = c + 1;
				}
			}
		}

		if (c == 100)
		{
			return true;
			
		}
		else
		{
			return false;
		}

	}

	/**
	Show all the cells
	*/

	public void showCells()
	{
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if (board[i][j] == BLANK)
				{
					board[i][j] = FREE;
				}
				else if (board[i][j] == HIDDENMINE)
				{
					board[i][j] = MINE;
				}
			}
		}


	}

	/**
	Start a new game
	*/

	public void newGame()
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				board[i][j] = BLANK;
			}
		}
		int m = getMinesNo();
		for(int i=0; i<m;i++)
		{
			boolean placed = false;
			do
			{
				int x = (int)(Math.random() * 10);
				int y = (int)(Math.random() * 10);
				if (board[x][y] == BLANK)
				{
					board[x][y] = HIDDENMINE;
					placed = true;
					//System.out.println("test1");
				}
			} while (placed = false);
				
		}
	}

}