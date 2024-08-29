package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 비트 연산자
		 * - 비트(bit) 단위로 연산한다
		 * byte, short, char 타입을 비트 연산하면 int 타입으로 
		 * 자동타입 변환되어 게산됨
		 * 
		 * 종류) ~, &, ^, |, <<, >>
		 * &(논리곱) AND 연산자 : 두 비트가 모두 1일 경우 1
		 * |(논리합) OR 연산자 : 두 비트중 하나만 1이면 결과는 1
		 * ^(베타적 논리합) : 두 비트가 다를 경우 결과 1
		 * <<(쉬프트연산자) : 왼쪽으로 지정한 숫자만큼 비트이동
		 * >>(쉬프트연산자) : 오른쪽으로 지정한 숫자만큼 비트이동
		 * ~(부정) NOT 연산자 : 모든 비트를 반대로 변경(피연산자의 1의 보수 반환)
		 */
		int num1 = 15; //1111
		int num2 = 20; //10100
		int result1 = num1 & num2; // 01111 & 10100 => 00100 = 4  
		System.out.println(result1);
		
		int result2 = num1 | num2; // 01111 | 10100 => 11111 = 31
		System.out.println(result2);
		
		int result3 = num1 ^ num2; // 01111 ^ 10100 => 11011 = 27
		System.out.println(result3);
		
		int result4 = num1 << 2; //1111 00 => 60
		System.out.println(result4);
		
		int result5 = num1 >> 2; // 0011 (11) => 3
		System.out.println(result5);
		
		int result6 = ~num1;// ~00001111 => 11110000 => -16
		System.out.println(result6);
	}
}
