package javaprograms;

import java.util.Scanner;

public class MultiplicationTableOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number :");
		int num = scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"is:"+(num*i));
		}
			
			
		
		
		

	}

}
