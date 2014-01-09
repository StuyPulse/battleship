import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	Board boar = new Board();
	Scanner sc = new Scanner(System.in);
	char guessLetter = 'X';
	int guessNumber = -1;
	while (guessLetter == 'X') {
	    System.out.println("Enter a letter coordinate a-e: ");
	    guessLetter = sc.next().charAt(0);
	    if((int)guessLetter < 'a' || (int)guessLetter > 'e')
		{
		    guessLetter = 'X';
		}
	}
	while (guessNumber == -1) {
	    System.out.println("Enter a number coordinate 1-5: ");
	    if (sc.hasNextInt()) {
		guessNumber = sc.nextInt();
	    }

	    if(guessNumber < 1 || guessNumber > 5)
		{
		    guessNumber = -1;
		}
	}	
	//hit=false;
	while(!boar.isClear()){
	      System.out.println(boar.isShip(guessLetter,guessNumber));
	}

		
	
    }
}	
