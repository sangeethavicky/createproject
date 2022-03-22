/*Question 3
Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
*/import java.util.Scanner;
public class multiplication {
public static void main(String[]args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scanner.nextInt();
	int i=1;
	for(i=1;i<=10;i++)
	{
		System.out.println(n+"*"+i+"= "+n*i);
	}
	
}
}
