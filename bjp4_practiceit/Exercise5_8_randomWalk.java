package bjp4_practiceit;

import java.util.Random;

//Write a method named randomWalk that performs a random one-dimensional walk, reporting each position reached and the maximum position 
//reached during the walk. The random walk should begin at position 0. On each step, you should either increase or decrease the position 
//by 1 (with equal probability). The walk stops when 3 or -3 is hit. The output should look like this:
//
//position = 0
//position = 1
//position = 0
//position = -1
//position = -2
//position = -1
//position = -2
//position = -3
//max position = 1

public class Exercise5_8_randomWalk {

	public static void main(String[] args) {
		randomWalk();

	}
	
	public static void randomWalk(){
		int position = 0;
		int maxPosition = 0;
		
		while (!((position == -3) || (position == 3))){
			
			Random random = new Random();
			int value = random.nextInt(2);
			System.out.println("Value: " + value );
			if(value == 0){
				position--;
			} 
			
			if(value == 1){
				position++;
			}
			
			if(maxPosition < position){
				maxPosition = position;
			}
			
//			System.out.println("position = " + position);
		}
//		System.out.println("max position = " + maxPosition);

	}
	

}
