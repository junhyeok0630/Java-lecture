package exam;

public class Example03 {
	/*
	 * final 클래스와 final 메소드
	 * final의 의미 : 처음 정의된 상태가 변하지 않는 것을 의미
	 * 
	 * - final 키워드는 클래스, 필드, 메소드 선언 시에 사용할 수 있다.
	 * - final 필드 : 초기 값 설정 후 수정될 수 없는 필드
	 * - final 클래스 : 상속할 수 없는 클래스(독신주의자, 독거노총각)
	 * 				  자식클래스를 가질 수 없다.
	 * - final 메소드 : 오버라이딩 할 수 없는 메소드 (자식에게 상속하지 않음)
	 */
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		a = 20;
		System.out.println(a);
		
//		final int a1 = 10;
//		System.out.println(a1);
//		a1 = 20;
//		System.out.println(a1);
	}
}
