package timbuchalka;

public class Car {
	// fields OR members
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	
	// getter
	public String getModel(){
		return this.model;
	}
	
	// setter
	public void setModel(String model){
		String validModel = model.toLowerCase();
		
		if(validModel.equals("carrera") || validModel.equals("commodore")){
			this.model = model;			
		} else {
			this.model = "Unknown";
		}
	}
}
