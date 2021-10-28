/* Name: Kevin Dao
	 * Date: 27-10-2021
	 *
	 * This programs function is to recreate the FizzBuzz game in java.
	 * 
	 * The program will take an input of n from user and will replace every number divisible by 3 that is less than n with "Fizz"
	 * and will also replace every number that is divisible by 5 with "Buzz". If a number is both divisible by 3 and by 5 then it will replace it with "FizzBuzz"
	 */

// Imports
import java.util.Scanner;


public class fizzBuzzProblem {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Thank you for testing out my FizzBuzz Java program!");
		int n = getValueN(); //Gets the value of n (the number the program will run up to) from the user
		runProgram(n);
	}

	public static int getValueN() { // Method to get the value of n from user
		int n;
		do {
			System.out.println("What integer would you like this program to run up to?(Must be an integer above 0): "); // asks the user the question
			while (!userInput.hasNextInt()) { // Checks if userInput is an integer or not
				System.out.println("The input you submitted was not in the correct format. Please only type in postive integers.\n");
				userInput.next(); //Skips that user input if the input was not in the correct format
			}
			n = userInput.nextInt(); // Sets n to userInput
		}while(!(0 < n)); // Continues to loop while the value of n is less than 0
		return n;
	}
	
	public static void runProgram(int n) { //Method to run the FizzBuzz game
		for (int i = 1; i<=n; i++) {// Loops from every number from 1 to n
			boolean isDivisibleBy3 = false; // True if number is divisible by 3
			boolean isDivisibleBy5 = false;// True if number is divisible by 5
			
			if (i % 3 == 0) { //Checks if current number is divisible by 3
				isDivisibleBy3 = true;
			}
			
			if (i % 5 == 0) { //Checks if current number is divisible by 5
				isDivisibleBy5 = true;
			}
			
			if (isDivisibleBy3 == true && isDivisibleBy3 == true) { //If number is both divisible by 3 and 5
				System.out.println("FizzBuzz\n");
			}else if (isDivisibleBy3 == true && isDivisibleBy5 == false) {//If number is both divisible by 3
				System.out.println("Fizz\n");
			}else if (isDivisibleBy3 == false && isDivisibleBy5 == true) {//If number is both divisible by 5
				System.out.println("Buzz\n");
			}else{ //If number is not divisible by 3 or 5
				System.out.println(i+"\n");
			}
			
		}
	}
}
