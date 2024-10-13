package javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int r,rev = 0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number :");
		int no = scanner.nextInt();
		scanner.close();
		
		while(no>0)
		{
			r=no%10;
			rev = rev*10+r;
			no =no/10;
			
			
			
		}
		System.out.println("Reverse "+rev);

		

	}

}
