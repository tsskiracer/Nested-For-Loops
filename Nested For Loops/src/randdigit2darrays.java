import java.util.Scanner;
public class randdigit2darrays
	{
		static int sNum=0;
		static int lNum=100;
		
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
					for(int col=0; col<myArray[0].length; col++)
						{
						int rNum = (int) (Math.random()*91)+10;
						myArray[uRow][uCol]=rNum;
						}
					
				}
			
					
			
			for (int fred:rNum)
				{
					System.out.println(fred);
				}
			}

	}
