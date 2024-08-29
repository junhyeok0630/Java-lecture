package exam;

public class Example01 {
	/*
	 * 클래스(class)
	 * - 일종의 틀, 설계도 이러한 것들을 클래스라고 한다.
	 * - 클래스 내부에는 멤버변수, 메소드, 생성자가 있다.
	 * - 클래스로부터 만들어진 객체를 인스턴스라고 한다.
	 * 
	 * 클래스의 구성요소
	 * - 멤버변수, 메소드, 생성자
	 * 
	 * 객체지향 프로그래밍의 개발의 단계
	 * 클래스 설계 > 인스턴스화(클래스를 이용한 객체 생성) > 생성된 객체를 사용
	 * 
	 * 클래스의 용도
	 * - 라이브러리(API)용 : 다른 클래스에서 사용할 목적으로 설계
	 * - 실행용 : 프로그램의 실행 => main() 메소드를 제공하는 역할을 한다
	 */
	public static void main(String[] args) {
		Student s1 = new Student(); // Student 클래스의 인스턴스
		Student s2 = new Student(); // Student 클래스의 인스턴스
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		if(s1 == s2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
