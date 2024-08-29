package animal;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.move();
		dog.run();
		dog.eat();
		
		cat.move();
		cat.run();
		cat.eat();
	}
}
