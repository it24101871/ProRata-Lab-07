import java.util.Scanner;

public class IT24101871Lab7Q1B {
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        int stuCount, count;
        float avg, sum;
        String grade;

        /*
         * markString = marks entered as a String
         * marks = String array containing individual marks
         * markInt = individual mark converted to integer
         */

        for(stuCount = 1; stuCount <= 3; stuCount++)
        {
            System.out.println("\nStudent " + stuCount);

            System.out.print("Enter marks: ");
            String markString = input.nextLine();

            String[] marks = markString.split("\\s+");

            sum = 0;

            for(count = 0; count < marks.length; count++)
            {
                int markInt = Integer.parseInt(marks[count]);
                sum = sum + markInt;
            }

            avg = sum / 4;

            if(avg >= 75)
            {
                grade = "Distinction";
            }
            else if(avg >= 50)
            {
                grade = "Credit";
            }
            else
            {
                grade = "Fail";
            }

            System.out.println("Average is : " + avg);
            System.out.println("Overall Grade is : " + grade);
        }

        input.close();
    }
}