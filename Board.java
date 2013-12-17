public class Board{
    boolean[][] grid;
    public Board(){
	grid = new boolean[5][5];
	for(int i = 0; i < 4; i = i + 1){
	    Random rand = new Random();
	    int x = rand.nextInt(5);
	    int y = rand.nextInt(5);
	    if (grid[x][y] == true){
		i--;
	    }
	    else {
		grid[x][y] = true;
	    }
	}
    }
    // column between A-E, row 1-5
    public boolean isShip(String column,int row) {
	int columnIndex = (int) column[0] - 'A';
	int rowIndex = row - 1;
	return grid[columnIndex][rowIndex];
    }
}