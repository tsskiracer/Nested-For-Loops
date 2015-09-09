import java.util.Scanner;
public class randdigit2darrays
	{

		public static void main(String[] args)
			{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Enter the number of rows.");
			int uRow=userInput.nextInt();
			System.out.println("Enter the number of columns");
			int uCol = userInput.nextInt();
			int myArray[][]=new int[uRow][uCol];		
			for(int row=0; row<myArray.length; row++)
				{
					for(int col=0; col<myArray.length; col++)
						{
						int rNum = (int) Math.random();
						myArray[uRow][uCol]=rNum;
						
						if (uCol)
							{
								
							}
						}
				}
			System.out.println(myArray);
			}

	}
