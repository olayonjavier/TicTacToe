
public class board {
	private final int ROWS = 3, COLS = 3;
	private static final int X = 0, O = 1;
	private static int[][] gameBoard;
	
	public board(){
		gameBoard = new int[ROWS][COLS];
	}
	
	public static void addToBoard(int player, int xPosition, int yPosition){
		if(player == X){
			gameBoard[xPosition][yPosition] = 'X';
		}
		else{
			gameBoard[xPosition][yPosition] = 'O';
		}
	}
	
	
	@Override
	public String toString(){
		for(int x = 0; x < ROWS; x++){
			for(int y = 0; y <COLS; y++){
				if(gameBoard[x][y] == 'X'){
					System.out.print("X");
				}
				else if(gameBoard[x][y] == 'O'){
					System.out.print("O");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		return "";
	}
}
