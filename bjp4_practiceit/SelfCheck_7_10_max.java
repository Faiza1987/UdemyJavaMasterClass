package bjp4_practiceit;

// Write a method called max that accepts an array of integers as a parameter and returns the maximum value in the array. For example, if the array passed stores {12, 7, -1, 25, 3, 9}, your method should return 25. You may assume that the array contains at least one element. Your method should not modify the elements of the array.
public class SelfCheck_7_10_max {

	public static void main(String[] args) {
		int[] arr = {12, 7, -1, 25, 3, 9};
		int[] arr2 = {12, 7, -1, 25, 3, 26};
		
		System.out.println(max(arr2));

	}
	
	public static int max(int[] arr){
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}

}
