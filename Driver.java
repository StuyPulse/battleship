import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char guessLetter='X';
		int guessNumber=-1;
		while (guessLetter=='X') {
		    System.out.println("Enter a letter coordinate A-E: ");
		    guessLetter = sc.next().charAt(0);
		    if((int)guessLetter<'A' || (int)guessLetter>'E')
		    {
			guessLetter='X';
		    }
	        }
		while (guessNumber==-1) {
		    System.out.println("Enter a number coordinate 1-5: ");
		    if (sc.hasNextInt()) {
			guessNumber = sc.nextInt();
		    }

		    if(guessNumber<1 || guessNumber>5)
		    {
			guessNumber=-1;
		    }
		}	

	
	}
}	
