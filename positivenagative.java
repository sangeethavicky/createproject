/*Question 11
Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
*/
import java.util.Scanner;
public class positivenagative {
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number:");
		int number,positive=0,nagative=0,zero=0;
			int num=scanner.nextInt();
			if(num>0)
			{
				positive++;
			}
			else if(num<0)
			{
				nagative--;
			}
			else
			{
				zero++;
			}
			System.out.println("");
}
}
