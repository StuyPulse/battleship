import java.util.*;

public class Board{
    boolean[][] grid;
    public Board(){
	grid = new boolean[5][5];
	for(int i = 0; i < 4; i++){
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
    public boolean isShip(char column,int row) {
	int columnIndex = column - 'a';
	int rowIndex = row - 1;
	grid[columnIndex][rowIndex] = false;
	return !grid[columnIndex][rowIndex];

    }
    
    public boolean isClear(){
	//clear=true;
	for(int i = 0; i < 5; i++){
	    for(int j = 0; j < 5; j++){
		if(grid[i][j]==true){
		    return false;
		}
	    }
	    
	}
	return true;
	
    }
}
