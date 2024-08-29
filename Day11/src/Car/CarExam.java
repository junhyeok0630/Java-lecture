package Car;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car(); // 클래스를 이용해 인스턴스 생성
		System.out.println("wheel의 개수는 " + car.wheel);
		
		car.wheel = 5;
		System.out.println("wheel의 개수는 " + car.wheel);
		
		car.ride();
		car.stop();
	}
}
