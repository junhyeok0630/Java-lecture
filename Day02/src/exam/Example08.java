package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * char (형)
		 * - 문자 그대로를 저장하는 것이 아닌, 유니코드라는 숫자로 값을 변환하여 저장
		 * 
		 * 유니코드란? 전 세계의 문자를 일관되게 표현할 수 있도록 설계된 표준
		 */
		char ga = '가'; // 문자 가 저장
		char na = '나';
		char a = 'A';
		char b = 'B';
		System.out.println(ga);
		System.out.println(na);
		System.out.println(a);
		System.out.println(b);
		
		// int형 선언시 그 문자에 해당하는 유니코드 값을 반환한다.
		int alphabet1 = 'A'; 
		int alphabet2 = 'a';
		int alphabet3 = 'B';
		int alphabet4 = 'b';
		System.out.println(alphabet1);
		System.out.println(alphabet2);
		System.out.println(alphabet3);
		System.out.println(alphabet4);
		
		char a1 = 65;
		System.out.println(a1);
		char a2 = 37;
		System.out.println(a2);
		char a3 = 97;
		System.out.println(a3);
		char a4 = 180;
		System.out.println(a4);
	}
}
