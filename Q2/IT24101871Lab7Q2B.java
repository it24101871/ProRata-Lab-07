public class IT24101871Lab7Q2B 
{
	public static void main (String [] args)
	{
		int decount =1;		
	
		for(int i=1; i<=5; i++)
		{
			System.out.print(+i +" - ");
		
			for(int j=1; j<=decount; j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
			decount = decount +1;
		}				
	}
}