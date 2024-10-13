package javaprograms;

import java.util.Scanner;

public class IntakingTwoNumberAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");

		int a = scanner.nextInt();
         
		System.out.println("Enter second Number :");
		int b = scanner.nextInt();
		
		scanner.close();
		
		
		System.out.println("sum of " +a+ " and " +b+ " is :"+(a+b));
	}

}
