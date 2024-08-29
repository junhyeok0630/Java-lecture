package exam;

public class Example02 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 초기화
		int studentAge = 20;
		System.out.println("학생의 나이는 : " + studentAge);
		String myCity = "Seoul";
		System.out.println("I am from " + myCity);
		
		// 변수 선언후 값 대입
		int myAge;
		myAge = 28;
		System.out.println("나의 나이는 : " + myAge);
		
		// 변수에 들어간 값이 바뀌어 두 출력문의 출력값이 다르다.
		int x = 5;
		System.out.println(x);
		x = 10;
		System.out.println(x);
		
		// 변수를 선언해서 사칙연산 수행
		int x1 = 10;
		int y1 = 5;
		System.out.println(x1 + y1); System.out.println(x1 - y1);
		System.out.println(x1 * y1); System.out.println(x1 / y1);
	}
}
