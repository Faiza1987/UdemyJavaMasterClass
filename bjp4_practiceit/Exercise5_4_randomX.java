package bjp4_practiceit;

//Write a method named randomX that keeps printing lines, where each line contains a random number of x characters 
//between 5 and 19 inclusive, until it prints a line with 16 or more characters. 
//For example, the output from your method might be the following. Notice that the last line has 17 x characters.

//xxxxxxx
//xxxxxxxxxxxxx
//xxxxxx  
//xxxxxxxxxxx.
//xxxxxxxxxxxxxxxxx

public class Exercise5_4_randomX {

	public static void main(String[] args) {
		randomX();
	}
	
	public static void randomX(){
        int random = 0;
        
        do {
     	   random = (int)(Math.random() * 15) + 5;
     	   System.out.print(random + "\t");     	   
     	   for(int i = 0; i < random; i++){
     		   System.out.print("x");
     	   }
     	   System.out.println();        	
        }
       while(random >= 5 && random < 16);
	}
}
