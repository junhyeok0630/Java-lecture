package exam;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 이용하여 원을 입력받아 달러로 바꾸어
		 * 다음과 같이 출력하세요
		 * $1 = 1100원으로 가정하세요
		 * 원화를 입력하세요 >>3300
		 * 3300원은 $3.0 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요 >> ");
		int won = sc.nextInt();
		float dollar = (float)won / 1100; // 연산자 우선 순서때문에 나누기 연산자 전 won을 형 변환 후 연산
		System.out.println(won + "원은 $" + dollar + "입니다.");
	}
}
