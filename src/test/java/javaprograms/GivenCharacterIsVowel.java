package javaprograms;

import java.util.Scanner;

public class GivenCharacterIsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter any character :");
		char c = scanner.next().charAt(0);
		
		boolean isVowel = false;
		
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel = true;
		}
		
		if(isVowel == true)
		{
			System.out.println("character is vowel");
		}
		
		else {
			System.out.println("character is not vowel");
		}
		
		scanner.close();
		

	}

}
