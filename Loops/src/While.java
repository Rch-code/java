import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

	//Use a while loop if you don't know how many times the loop will run		
		// While loop to sum numbers 1 - 100
		while (number <= 100) {
			sum = sum + number;
			number = number + 1;
		}
		System.out.println ("while loop: The sum of numbers from 1 - 100 = " + sum);
		
		sum = 0;
		number = 1;
		
		// While loop to sum odd numbers from 1 - 100
		while (number <= 100) {
			sum = sum + number;
			number = number + 2;
		}
		System.out.println("while loop: The sum of odd numbers from 1 - 100 = " + sum);
	
	//Use a for loop when you know how many times your loop is going to run
		
		//For loop to sum numbers from 1 -100
		sum = 0;
		for (number = 1;number <=100;number = number + 1) {
			sum = sum + number;
		}
		System.out.println("for loop: The sum of numbers from 1 - 100 = " + sum);
	
		sum = 0;
		//for loop to sum numbers from 1 - 100
		for (number = 1;number <= 100;number = number + 2) {
			sum = sum + number;
		}
		System.out.println("for loop: The sum of odd numbers from 1 - 100 = " + sum);
	
	//Program to determine if user number is a prime number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int userInput = scanner.nextInt();
		System.out.println("The number you entered was :" + userInput);
		
		int potentialFactor = 2;
		while (userInput % potentialFactor != 0) {
			potentialFactor++;
		}
		if (potentialFactor == userInput) {
			System.out.println("The number is prime");			
		} 
		else {
			System.out.println("The number is NOT prime, lowest factor = " +potentialFactor);
		}
	}

}
