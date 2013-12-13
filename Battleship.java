import java.util.Scanner;
public class Battleship{
	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		String input = scan1.nextLine();
		boolean bValidInput = analyzeInput(input);
	}
	public static boolean analyzeInput(String sInput)
	{
		int nLabel;
		char cLabel;
		
		if ((sInput.indexOf("one") != -1) || (sInput.indexOf("1") != -1))
		{
			nLabel = 1;
		}
		else if ((sInput.indexOf("two") != -1) || (sInput.indexOf("2") != -1))
		{
			nLabel = 2;
		}
		else if ((sInput.indexOf("three") != -1) || (sInput.indexOf("3") != -1))
		{
			nLabel = 3;
		}
		else if ((sInput.indexOf("four") != -1) || (sInput.indexOf("4") != -1))
		{
			nLabel = 4;
		}
		else if ((sInput.indexOf("five") != -1) || (sInput.indexOf("5") != -1))
		{
			nLabel = 5;
		}
		else {return false;}

		if ((sInput.indexOf("A") != -1) || (sInput.indexOf("a") != -1))
		{
			cLabel = 'A';
		}
		else if ((sInput.indexOf("B") != -1) || (sInput.indexOf("b") != -1))
		{
			cLabel = 'B';
		}
		else if ((sInput.indexOf("C") != -1) || (sInput.indexOf("c") != -1))
		{
			cLabel = 'C';
		}
		else if ((sInput.indexOf("D") != -1) || (sInput.indexOf("d") != -1))
		{
			cLabel = 'D';
		}
		else if ((sInput.indexOf("E") != -1) || (sInput.indexOf("e") != -1))
		{
			cLabel = 'E';
		}
		else {return false;}

		return true;
	}
}
