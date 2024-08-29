package exam;
import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아 짝수인지 홀수인지
		 * 판단하는 프로그램을 삼항연산자로 작성하세요 !!
		 * 
		 * 숫자입력 >> 2 
		 * 결과) 짝수입니다.
		 * 
		 * 숫자입력 >> 5
		 * 결과) 홀수입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다."; // 2로나눴을때 나머지가 0이면 true값(짝수출력)
																   // 0이 아니면 fasle값(홀수출력)
		System.out.println("결과) " + result);
	}
}
