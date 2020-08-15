package bjp4_practiceit;

//Write a method named printAverage that accepts a Scanner for the console as a parameter and repeatedly prompts the user for numbers. 
//Once any number less than zero is typed, the average of all non-negative numbers typed is displayed. Display the average as a double, 
//and do not round it. For example, a call to your method might look like this:

//Scanner console = new Scanner(System.in);
//printAverage(console);
//The following is one example log of execution for your method:

//Type a number: 7
//Type a number: 4
//Type a number: 16
//Type a number: -4
//Average was 9.0
//If the first number typed is negative, do not print an average. For example:

//Type a number: -2

import java.util.Scanner;

public class Exercise5_12_printAverage {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printAverage(console);

	}
	
	public static void printAverage(Scanner console){
		double number = 0.0;
		double sum = 0.0;
		int count = 0;
		double average = 0.0;
		
		do {
			System.out.print("Type a number: ");
			number = console.nextDouble();
			if(number >= 0){
				sum += number;
				count++;
			}

			average = sum / count;
			
		}while(number >= 0);
		
		if(average >= 0){
			System.out.println("Average was " + average);
		}
	}
	

}
