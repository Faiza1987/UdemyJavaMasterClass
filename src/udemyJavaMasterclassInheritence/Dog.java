package udemyJavaMasterclassInheritence;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, 
			int tail, int teeth, String coat) {
		// initializes the base characteristics of an Animal
		super(name, 1, 1, size, weight);
		
		// unique characteristics of Dog
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;		
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();	
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		// only executes the move() in the parent class
		super.move(5);
//		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
}
