public class IT24101871Lab7Q2C 
{
	public static void main (String [] args)
	{
		int decount = 5;		
	
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=decount; j++)
			{
				System.out.print(+decount);
			}
			System.out.print("\n");
			decount = decount - 1;
		}				
	}
}