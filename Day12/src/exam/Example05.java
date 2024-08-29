package exam;

import java.util.Scanner;

class MethodTest {
	public int getSum(int num1, int num2) { // 매개변수가 두 개일 때 실행하는 메소드
		return num1 + num2;
	}
	public int getSum(int num1, int num2, int num3) { // 매개변수가 세 개 일 때 실행
		return num1 + num2 + num3;
	}
}

public class Example05 {
	public static void main(String[] args) {
		MethodTest test = new MethodTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num3 = sc.nextInt();
		
		System.out.println(test.getSum(num1, num2)); // 매개변수 2개
		System.out.println(test.getSum(num1, num2, num3)); // 매개변수 3개
	}
}
