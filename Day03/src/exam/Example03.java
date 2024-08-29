package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 실수형 간의 형 변환
		 * - 크기가 큰 자료형(double)에서 작은 자료형(float)으로 변환할 때
		 * float의 저장 범위를 넘어서는 값을 대입하면 무한대가 되거나 0이 된다.
		 */
		// 1.0 x (10의 100승)
		double d1 = 1.0e100;
		float f1 = (float) d1;
		System.out.println(f1);
		
		// 1.0 x (10의 -100승)
		double d2 = 1.0e-100;
		float f2 = (float)d2;
		System.out.println(f2);
		
		System.out.println("==================");
		
		// 실수에서 정수로 형변환
		double pie = 3.14;
		int pieInt = (int) pie;
		System.out.println(pieInt);
		
		// 정수에서 실수로 형 변환 (크기가 작은 자료형에서 큰 자료형으로 변환하기 때문에 형변환 연산자 생략가능)
		int num = 100;
		double numD = num;
		System.out.println(numD);
		float numF = num;
		System.out.println(numF);
		
		// float의 범위를 벗어나 이상한 값 출력
		int i = 99999999;
		float f = (float) i;
		System.out.println(f);
	}
}
