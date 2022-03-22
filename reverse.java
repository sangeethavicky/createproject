/*Question 6
Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321
*/import java.util.Scanner;
public class reverse {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int rev_num=0;
		int remainder;
		int num=scanner.nextInt();
		while(num!=0)
		{
			remainder=num%10;
			rev_num=rev_num*10 + remainder;
			num=num/10;
			
		
		}
	
	System.out.println("Reverse of number is: "+ rev_num);
	}

}
