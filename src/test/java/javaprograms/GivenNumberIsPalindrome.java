package javaprograms;

import java.util.Scanner;

public class GivenNumberIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number :");
		int originalnumber = scanner.nextInt();
		scanner.close();
		int number = originalnumber;
		int reversednumber =0;
		
		while(number!=0)
		{
			int reminder = number%10;
			reversednumber=(reversednumber*10)+reminder;
			number = number/10;
			
			
			
			
		}
		if(originalnumber==reversednumber)
		{
			System.out.println("number is palindrome");
			
		}else {
			System.out.println("number is not palindrome");
		}
		
		

	}

}
