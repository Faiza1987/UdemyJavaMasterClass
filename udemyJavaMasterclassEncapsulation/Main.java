package udemyJavaMasterclassEncapsulation;

public class Main {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Tim";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health: " + player.healthRemaining());
//		
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health: " + player.healthRemaining());
		
		EnhancedPlayer ePlayer = new EnhancedPlayer("Tim", 250, "Sword");
		System.out.println("Initial health is " + ePlayer.getHealth());

	}
}
