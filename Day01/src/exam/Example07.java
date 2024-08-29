package exam;

public class Example07 {
	public static void main(String[] args) {
		// 실수 표현
		/*double a = 1.1;
		System.out.printf("%f\n", a);
		System.out.printf("%f\n", 1.23);
		
		System.out.printf("%.1f", 1.1234567); // 소수점 첫째자리까지 출력
		System.out.println();
		System.out.printf("%.2f", 1.1234567); // 소수점 둘째자리까지 출력
		System.out.println();
		System.out.printf("%.3f", 1.1234567); // 소수점 셋째자리까지 출력
		
		// 문자열
		String str = "Hello Java";
		System.out.printf("%s", str); // 문자열을 서식문자로 출력
		System.out.println();
		
		// 문자출력
		char c = 'A';
		System.out.printf("%c", c);
		System.out.println();
		*/
		
		// 출력문을 통해 자신의 이름 나이 성별 출력하기
		
		System.out.println("이름 : Choi");
		System.out.println("나이 : 23");
		System.out.println("성별 : 남");
		System.out.println();
		
		// printf문 사용하기
		System.out.printf("이름 : %s\n", "Choi");
		System.out.printf("나이 : %d\n", 23);
		System.out.printf("성별 : %c", '남');
		
	}
}
