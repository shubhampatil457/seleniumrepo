package javaprograms;

import java.util.Scanner;

public class SwapTwoNoWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :" );//6
		int a = scanner.nextInt();
		System.out.println("Enter second number :" );//5
	    int b = scanner.nextInt();
	    scanner.close();
	    
	    a=a+b;//11
	    b=a-b;//6
	    a=a-b;//5
	    
	    System.out.println("value of a "+a);
	    System.out.println("value of b "+b);
	    
	    
	    
	    
	    
	    
		

	}

}
