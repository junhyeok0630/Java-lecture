package exam;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * 기본자료형
		 * - 정수, 실수, 논리 타입으로 분류된 8개의 자료형이 있고
		 * 각각 저장 크기가 다르며 기본값이 정해져 있음
		 * - 실제 데이터 값을 저장
		 * - 정수형, 실수형, 논리형
		 * 
		 * 참조자료형
		 * - 배열형, 열거형, 클래스, 인터페이스
		 * - 데이터가 저장되어 있는 메모리 번지를 저장
		 * 
		 * Stack 영역과 Heap 영역
		 * 
		 * Stack 영역 
		 * - 기본자료형(int, double, byte, long, boolean)등 해당하는
		 * 지역변수의 값이 저장되는 공간
		 * - Heap 영역에 생성된 Object 타입의 데이터 참조값이 할당된다.
		 * 참조값이란?
		 * - 객체의 메모리를 생성했을 때 메모리와 연결된 유일한 숫자값(주소값)
		 * 
		 * Heap 영역
		 * - 객체와 배열이 생성되는 영역
		 * - 참조하는 변수나 필드가 없다면 의미없는 객체로 이를 쓰레기 값으로 취급
		 * - JVM은 이러한 것들을 가비지 컬렉터를 실행시켜 자동으로 객체를 제거
		 */
		int age = 20;
		double height = 170;
		String name = "Choi"; // 디버깅 창의 (id(23)가 객체 Choi의 참조값)
		String job = "Student";// 디버깅 창의 (id(31)가 객체 Student의 참조값)
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(job);
		
		// Sting타입의 선언은 사실 아래 구문의 함축된 구문이다.
		String name1 = new String("홍길동"); // new는 객체를 생성할 때 사용한다.
		System.out.println(name1);
	}
}
