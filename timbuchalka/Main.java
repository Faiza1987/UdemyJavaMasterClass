package timbuchalka;

public class Main {
	public static void main(String[] args){
		Car porsche = new Car();
		Car holden = new Car();
		
		porsche.setModel("Carrera");
	 	System.out.println("Model is " + porsche.getModel()); // Carrera
	 	
		holden.setModel("Commodore");
		System.out.println("Model is " + holden.getModel()); // Commodore
		
		holden.setModel("DeLorean Time Machine");
		System.out.println("Model is " + holden.getModel()); // Unknown
	}
}
