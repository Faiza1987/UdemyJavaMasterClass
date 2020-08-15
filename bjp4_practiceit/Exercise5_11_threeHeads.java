package bjp4_practiceit;

import java.util.Random;

// Write a method named threeHeads that repeatedly flips a coin until three heads in a row are seen. You should use a Random object to give an equal chance to a head or a tail appearing. 
// Each time the coin is flipped, what is seen is displayed (H for heads, T for tails). When 3 heads in a row are flipped a congratulatory message is printed. 
// Here are possible outputs of two calls to threeHeads:

// T T T H T H H H
// Three heads in a row!

public class Exercise5_11_threeHeads {

	public static void main(String[] args) {
		threeHeads();
	}
	
	public static void threeHeads(){
		StringBuilder heads = new StringBuilder();
		
		do {
			Random random = new Random();
			int value = random.nextInt(2);
			
			if(value == 1){
				heads.append("H ");
			} else {
				heads.append("T ");
			}


		}while(!(heads.toString().contains("H H H")));
		
		System.out.print(heads);
		System.out.println("\nThree heads in a row!");
	}

}
