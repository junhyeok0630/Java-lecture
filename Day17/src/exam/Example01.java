package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 에러(Error)외 예외 (Exception) 차이
		 * 
		 * 에러(Error)
		 * - 시스템이 종료되어야 할 수준의 상황과 같이 수습할 수 없는 심각한 문제를 의미
		 * 
		 * 예외 (Exception)
		 * - 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생
		 * - 자바는 객체지향 언어이기 때문에 프로그램에서 발생하는 예외들을 클래스의 형태로 제공한다.
		 * - 예외는 체크예외(Check exception)와 비체크 예외(Unchecked exception) 
		 * 두 가지가 있다.
		 * 
		 * 체크예외 : 파일 입출력(IOException), SQLException(db연동)
		 * 비체크예외 : ArithmeticException, NullPointerException 등등...
		 * 
		 * 형식)
		 * try {
		 * 		예외가 발생할 수 있는 코드 작성...
		 * } catch(예외명 e) {
		 * 		예외처리 코드
		 * }
		 */
		System.out.println(4 / 0);
	}
}
