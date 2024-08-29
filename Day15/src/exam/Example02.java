package exam;

class Animal{
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Bird extends Animal {
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}

public class Example02 {
	/*
	 * 다형성 (Polymorphism)
	 * - 객체 지향 프로그래밍의 대표적인 특징 중 하나
	 * - 하나의 객체가 여러가지 타입을 가질 수 있다.
	 * - 부모 클래스 타입의 참조 변수를 자식 클래스 타입의 인스턴스를 참조할 
	 * 수 있도록 구현
	 * - 다형성의 장점으로는 코드의 재사용성과 유연성을 높여준다 !!
	 */
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
		
		Animal animal3 = new Bird();
		animal3.sound();
	}
}
