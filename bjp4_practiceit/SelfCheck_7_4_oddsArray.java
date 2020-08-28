package bjp4_practiceit;

import java.util.Arrays;

// Write code that creates an array named odds and stores all odd numbers between -6 and 38 into it using a for loop. Make the array's size exactly large enough to store the numbers.

public class SelfCheck_7_4_oddsArray {

	public static void main(String[] args) {
		
		int[] odds = new int[(38 + 6) / 2];
		
		int index = 0;
		
		for(int i = -6; i < 38; i++){
			if(i % 2 != 0){
				odds[index] = i;
				index++;
			}
		}
		System.out.println(Arrays.toString(odds));
	}
}
