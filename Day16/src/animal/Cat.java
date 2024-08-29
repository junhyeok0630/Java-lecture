package animal;

public class Cat implements Animal {

	@Override
	public void move() {
		System.out.println("고양이 움직임");
	}

	@Override
	public void eat() {
		System.out.println("고양이 밥먹음");
	}

	@Override
	public void run() {
		System.out.println("고양이 달림");
	}

}
