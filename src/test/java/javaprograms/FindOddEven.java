package javaprograms;

import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any number :");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number%2==0)
		{
			System.out.println(number+" is even");
			
		}else {
			System.out.println(number+" is odd");
		}
		
		

	}

}
