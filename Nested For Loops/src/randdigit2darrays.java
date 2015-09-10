import java.util.Scanner;
public class randdigit2darrays 
{
			static int sNum=100;
			static int lNum=0;
			
			public static void main(String[] args)
				{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Enter the number of rows.");
				int uRow=userInput.nextInt();
				System.out.println("Enter the number of columns");
				int uCol = userInput.nextInt();
				int myArray[][]=new int[uRow][uCol];		
				int rNum=0; 
				for(int row=0; row<myArray.length; row++)
					{
						for(int col=0; col<myArray[0].length; col++)
							{
							rNum= (int) (Math.random()*91)+10;
							myArray[row][col]=rNum;
							if (sNum>rNum)
							{
								sNum=rNum;
							}
							if (lNum<rNum)
							{
								lNum=rNum;
							}		
							System.out.print(rNum + " ");	

							}
							
							System.out.println("\n");
					}
					
							System.out.println("The smaller number is "+ sNum);												
							System.out.println("The larger number is "+ lNum);
														
						System.out.println();
						
					
				
				}

		}