package bjp4_practiceit;

import java.util.Arrays;

//Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method should return false if no such midpoint relationship exists.
//
//The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.
//
//Calls such as the following should return true:
//
//hasMidpoint(4, 6, 8)
//
//hasMidpoint(2, 10, 6)
//
//hasMidpoint(8, 8, 8)
//
//hasMidpoint(25, 10, -5)
//
//Calls such as the following should return false:
//
//hasMidpoint(3, 1, 3)
//
//hasMidpoint(1, 3, 1)
//
//hasMidpoint(21, 9, 58)
//
//hasMidpoint(2, 8, 16)


public class Exercise_5_14_hasMidpoint {
	public static void main(String[] args){
		// true
		System.out.println(hasMidpoint(4, 6, 8) + "\n");
		System.out.println(hasMidpoint(2, 10, 6) + "\n");
		System.out.println(hasMidpoint(8, 8, 8) + "\n");
		System.out.println(hasMidpoint(25, 10, -5) + "\n");
		
		// false
		System.out.println(hasMidpoint(3, 1, 3) + "\n");
		System.out.println(hasMidpoint(1, 3, 1) + "\n");
		System.out.println(hasMidpoint(21, 9, 58) + "\n");
		System.out.println(hasMidpoint(2, 8, 16) + "\n");
	}
	
	public static boolean hasMidpoint(int a, int b, int c){
		
		if(a == (b + c) / 2.0 || b == (a + c) / 2.0 || c == (a + b) / 2.0){
			return true;
		}
				
		return false;		
	}

}
