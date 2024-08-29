package exam;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 시험 점수를 입력받아 65점이상이면 합격 아니면 불합격을 출력하고
		 * 만약 숫자가 아닌 값을 입력받으면 그에 해당하는 예외처리를 하세요!!
		 */
		try {
			System.out.println("시험 점수를 입력하세요 >> ");
			int score = sc.nextInt();
			if (score >= 65) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} catch(InputMismatchException e) {
			System.out.println("입력 값이 숫자가 아닙니다.");
		}
	}
}
