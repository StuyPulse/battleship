import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLetterCoor = sc.next();
		int inputNumberCoor;
		if (sc.hasNextInt()) {
			inputNumberCoor = sc.nextInt();
		}
		else {
			System.out.println("Stop being evil and put in a number!");
			inputNumberCoor = 1;
		}

		String guessLetter;
		int guessNumber;

		if (inputLetterCoor.equalsIgnoreCase("A")) {
			guessLetter = "A";		
		}
		else if (inputLetterCoor.equalsIgnoreCase("B")) {
			guessLetter = "B";		
		}
		else if (inputLetterCoor.equalsIgnoreCase("C")) {
			guessLetter = "C";		
		}
		else if (inputLetterCoor.equalsIgnoreCase("D")) {
			guessLetter = "D";		
		}
		else if (inputLetterCoor.equalsIgnoreCase("E")) {
			guessLetter = "E";		
		}
		else {
			System.out.println("Please input a coordinate from A to E");
		}

		if (inputNumberCoor > 0 && inputNumberCoor < 6) {
			guessNumber = inputNumberCoor;
		}
		else {
			System.out.println("Please input a coordinate from 1 to 5");
		}

		
	
		
	}
}	
