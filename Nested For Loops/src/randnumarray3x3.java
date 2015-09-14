
public class randnumarray3x3
	{

		public static void main(String[] args)
			{
				int myArray[][] = new int [7][7];
				for(int row=0; row<myArray.length; row++)
					{
						for (int col = 0; col<myArray[0].length; col++)
							{
								int rNum =(int) (Math.random()*10);
								
								myArray[row][col]=rNum;
							}
					}
				for(int row=0; row<myArray.length; row++)
					{
						for (int col = 0; col<myArray[0].length; col++)
							{
								
								System.out.print(myArray[row][col]+ " ");
							}
						System.out.println();
					}

			}

	}
