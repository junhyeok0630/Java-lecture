package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 3자리 숫자 하나를 입력받아 백의 자리 이하를 버리는 코드이다
		 * 만약 숫자를 456을 입력받았다면 400이 되고
		 * 111을 입력받으면 100이된다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int num1 = sc.nextInt();
		int result1 = num1 - num1 % 100;
		System.out.println("결과 : " + result1);
		
		
		System.out.print("숫자입력 >> ");
		int num2 = sc.nextInt();
		String result2 = (num2 >= 70) ? "합격" : "불합격";
		System.out.println(result2);
	}
}
