package errorhandling;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		int numerator=10;
		
		int denominator=0;
		
		int quotient=0;
		
		try {
		quotient=(numerator/denominator); //critical operation at line 19
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter a non-zero, positive denominator :");
			denominator=s.nextInt();
			quotient=(numerator/denominator);
			//FIX
			
		}
		
		System.out.println("Result of Division = "+quotient);
		
		
		System.out.println("Bye Bye !!! ");
		
	}

}
