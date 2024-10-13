package javaprograms;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = scanner.nextInt();
        scanner.close();

        // Handle case where the number is 1, which is not prime
        if (number == 1) {
            System.out.println("Smallest prime is 2");
            return;  // Exit after handling special case
        }

        // Prime checking logic
        int i;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime");
                return;  // Exit as soon as we find a divisor
            }
        }

        // If the loop completes, it means the number is prime
        if (i == number) {
            System.out.println("Number is prime");
        }
    }

}

