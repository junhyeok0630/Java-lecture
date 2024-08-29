package animal;

public class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("강아지 움직임");
	}

	@Override
	public void eat() {
		System.out.println("강아지 밥먹음");
	}

	@Override
	public void run() {
		System.out.println("강아지 뜀");
	}

}
