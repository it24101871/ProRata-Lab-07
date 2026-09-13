import java.util.Scanner;

public class IT24101871Lab7Q1A
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int[] mark = new int[5];
		
		int count, sum;
		float avg;
		String grade;
		
		count=1;
		sum=0;

		System.out.println("Enter marks for four subjects : ");
		
		
		//looping
		while(count<=4)
		{
			System.out.print("Enter Subject Mark" +count +": ");
			mark[count] = input.nextInt();
		
			//calculating sum		
			sum = sum + mark[count]; 
	
			//increment
			count++;
		}	
		
		avg = sum / 4;
		
		if (avg >= 75)
		{
			grade = "Distinction";		
		}	
		else if(avg >=50)
		{
			grade = "Credit";	
		}
		else
		{	
			grade = "Fail";
		}
		
		System.out.println("Average is : "+avg);
		System.out.print("Overall Grade is : " +grade);


	}
}