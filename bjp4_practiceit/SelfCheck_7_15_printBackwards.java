package bjp4_practiceit;

// Write a method printBackwards that prints an array of integers in reverse order, in the following format.

//For the array {1, -3, 4, 7, 2}:

//element [4] is 2
//element [3] is 7
//element [2] is 4
//element [1] is -3
//element [0] is 1


public class SelfCheck_7_15_printBackwards {

	public static void main(String[] args) {
		
		int[] arr = {1, -3, 4, 7, 2};
		printBackwards(arr);


	}
	
	public static void printBackwards(int[] arr){
		
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.println("element [" + i + "] is " + arr[i]);
		}
	}

}
