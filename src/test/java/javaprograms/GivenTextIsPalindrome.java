package javaprograms;

import java.util.Scanner;

public class GivenTextIsPalindrome
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any text :");
	
		
		 String originaltext = scanner.nextLine();
		 
		 scanner .close();
		 
		 
		 char[] ca = originaltext.toCharArray();
		 int size = ca.length;
		 
		 String reverstext ="";
		 
		 
		 for(int i=size-1;i>=0;i--)
		 {
			 reverstext = reverstext + ca[i] ; 
		 }
		 
		 if(originaltext.equals(reverstext))
		 {
			 System.out.println(originaltext + " is plaindrome");
			 
		 }
		 else {
			 System.out.println(originaltext + "is not palindrome");
		 }
			 
		 
		 
		 
		
		
		
		
		

	}

}
