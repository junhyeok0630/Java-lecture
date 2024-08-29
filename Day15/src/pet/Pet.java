package pet;

public abstract class Pet {
	abstract public void walk();
	abstract public void eat();
	
	public int health;
	
	public void run() {
		System.out.println("run");
	}
}
