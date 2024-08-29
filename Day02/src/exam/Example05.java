package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 자료형 (Data Type)
		 * - 어떠한 변수든지 타입(Type)이 있으며, 타입에 따라 저장할 수 있는
		 * 값의 종류와 범위가 다르다.
		 * 
		 * 정수형
		 * - byte, short, int, long
		 * 
		 * 실수형
		 * - float, double
		 * 
		 * 논리형
		 * - boolean
		 */
		// byte 타입 (-128 ~ 127)
		// - 색상 정보 및 파일 또는 이미지 등의 이진(Binary) 데이터를 처리할 때 주로 사용
		byte value1 = -128;
		byte value2 = -50;
		byte value3 = 0;
		byte value4 = 50;
		byte value5 = 127;
		//byte value6 = 128;
		//byte value7 = 129;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
	}
}
