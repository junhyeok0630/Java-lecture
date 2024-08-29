package circle;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle pizza; // 인스턴스 pizza 선언
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10;
		pizza.name = "불고기피자";
		
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
		
		Circle donut = new Circle();
		donut.radius = sc.nextInt();
		donut.name = "플레인베이글";
		double area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
