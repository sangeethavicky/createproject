/*Question 4
Write a program to find the factorial value of any number entered through the keyboard. 
*/import java.util.Scanner;
public class factorialnumber {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the positive number");
		int num=scanner.nextInt();
	
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial number:"+fact);
	}

}
