package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 점수를 입력받아 70점 이상이면 합격 미만이면 불합격을 출력하도록 삼항연산자를 이용하여 작성
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int num2 = sc.nextInt();
		String result2 = (num2 >= 70) ? "합격" : "불합격";
		System.out.println(result2);
	}
}