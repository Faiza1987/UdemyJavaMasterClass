package bjp4_practiceit;

// Write a method named consecutive that accepts three integers as parameters and returns true if they are three consecutive numbers; that is, 
//if the numbers can be arranged into an order such that there is some integer k such that the parameters' values are k, k+1, and k+2. 
//Your method should return false if the integers are not consecutive. Note that order is not significant; your method should return the 
//same result for the same three integers passed in any order.

//For example, the calls consecutive(1, 2, 3), consecutive(3, 2, 4), and consecutive(-10, -8, -9) would return true. 
//The calls consecutive(3, 5, 7), consecutive(1, 2, 2), and consecutive(7, 7, 9) would return false.
		
public class Exercise_5_13_consecutive {

	public static void main(String[] args) {
		System.out.println(consecutive(1, 2, 3)); // true
		System.out.println(consecutive(3, 2, 4)); // true
		System.out.println(consecutive(-10, -8, -9)); // true
		System.out.println(consecutive(53, 51, 52)); // true
		
		System.out.println(consecutive(3, 5, 7)); // false
		System.out.println(consecutive(7, 7, 9)); // false
		System.out.println(consecutive(1, 2, 2)); // false
		System.out.println(consecutive(6, 3, 7)); // false


	}
	
	public static boolean consecutive(int a, int b, int c){
//		int k = Math.min(a, Math.min(b, c));
		
		int k = 0;
		if(a < b && a < c){
			k = a;
		} else if(b < a && b < c){
			k = b;
		} else {
			k = c;
		}
	
		
		if(k + (k + 1) + (k + 2) == (a + b + c)){
			return true;
		}
		
		return false;
	}

}
