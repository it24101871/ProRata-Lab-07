import java.util.Scanner;

public class IT24101871Lab7Q3 {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		int cusCount;
		float amount, discount, finalPay;
		char payMode;
					

		for(cusCount=1; cusCount<=5; cusCount++)
		{

			System.out.println("\n\nCustomer " +cusCount);
					
			System.out.print("Enter total bill amount : ");
			amount = input.nextFloat();
			
			discount = amount*5/100;
			
			finalPay = amount - discount;
			
			System.out.print("Enter mode of payment (C for cash, O for other) : ");
			payMode = input.next().charAt(0);
			
			
			switch(payMode)
			{
				case 'C':
					
					System.out.println("Discount is : " +discount);
					System.out.println("Amount to be paid : " +finalPay);
			 		break;
				
				case 'c':
					
					System.out.println("Discount is : " +discount);
					System.out.println("Amount to be paid : " +finalPay);
			 		break;
				
				case 'O':
				
					System.out.println("No discount applicable");
					System.out.println("Amount to be paid : " +amount);
			
				case 'o':
					
					System.out.println("No discount applicable");
					System.out.println("Amount to be paid : " +amount);
				
				default : 
						
					System.out.print("Payment mode is Invalid");
			}
			
				
		}
		
		



				
	}
}