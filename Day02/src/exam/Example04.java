package exam;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 변수는 선언된 블록 내에서만 사용이 가능하다.
		 * 함수 내에서 선언된 변수를 지역변수라고 한다.
		 * 
		 */
		//int n = 5;
		if(true) {
			int n = 5;
			System.out.println("변수 n의 값 : " + n);
		}
		//System.out.println("변수 n의 값 : " + n);
 	}
}