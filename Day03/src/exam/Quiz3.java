package exam;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈 출력하세요 !!~~
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
	}
}
