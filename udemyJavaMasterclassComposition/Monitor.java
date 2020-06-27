package udemyJavaMasterclassComposition;

public class Monitor {
	private String model;
	private String manufacturer;
	private int screenSize;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int screenSize, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.screenSize = screenSize;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color){
		System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
	
}
