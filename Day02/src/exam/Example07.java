package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 실수형(float, double)
		 * 
		 * 크기가 작은 것 : float (4byte)
		 * 크기가 큰 것 : double (8byte)
		 */
		double marathon = 42.195;
		// float형은 반드시 뒤에 f or F를 붙혀야 한다.
		float halfMarathon = 21.0975F;
		System.out.println("마라톤은 " + marathon + "km를 달린다.");
		System.out.println("하프마라톤은 " + halfMarathon + "km를 달린다.");
		
		/*
		 * float는 소수점 7자리까지 정확하게 표현된다.
		 * double은 소수점 15자리까지 정확하게 표현된다.
		 * 컴퓨터에서 실수를 가지고 수행하는 모든 연산에는 작은 오차가 존재한다.
		 * 자바뿐 아니라 모든 프로그래밍 언어에서 발생하는 기본적인 문제
		 */
		double pipDouble = 3.141592653589793;
		float pipFloat = 3.141592653589793F;
		System.out.println(pipDouble);
		System.out.println(pipFloat);
	}
}
