/*Question 8
Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 
*/
import java.util.*;
public class primenumber {
	static Scanner kb = new Scanner(System.in);

	    public static void main(System[]args) 
	    {

	        System.out.print("\fEnter positive integer:");

	        int num = kb.nextInt();

	        if (num < 1)

	            System.out.print("Please enter number greater than 1"
	                    + "Perform the program again");

	        else if (num == 2)
	            System.out.print("its a prime yey!");

	        else if (num % 2 == 0)
	            System.out.print("its not a prime ");

	    }
	}


