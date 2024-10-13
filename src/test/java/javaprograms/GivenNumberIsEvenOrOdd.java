package javaprograms;

import java.util.Scanner;

public class GivenNumberIsEvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number:");
		int num = scanner.nextInt();
		
		scanner.close();
		if(num%2==0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println("number is odd");
		}
		

	}

}
