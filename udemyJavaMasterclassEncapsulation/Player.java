package udemyJavaMasterclassEncapsulation;

public class Player {
	public String fullame;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage){
		this.health = this.health - damage;
		if(this.health <= 0){
			System.out.println("Player is knocked out");
			// Reduce # of lives remaining for the player
		}
	}
	
	public int healthRemaining(){
		return this.health;
	}
}
