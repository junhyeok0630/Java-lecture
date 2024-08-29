package exam;

public class Example05 {
	public static void main(String[] args) {
		// 강제 타입 변환
		int intVar = 65;
		char charVar = (char) intVar;
		System.out.println(charVar);
		
		intVar = 300;
		byte byteVar = (byte) intVar; // byte 타입의 범위를 넘겨 이상한 값 출력
		System.out.println(byteVar);
		
		double doubleVar = 3.14;
		intVar =(int) doubleVar; // 소수점 이하의 손실 발생
		System.out.println(intVar);
	}
}
