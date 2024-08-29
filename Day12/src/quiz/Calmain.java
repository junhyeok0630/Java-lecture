package quiz;

import java.util.Scanner;

class Calculator{
	public int a;
	public int b;
	public int calculate(int a, int b, char operator) {
		int result = 0;
		switch(operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}
		return result;
	}
}

public class Calmain {
	/*
	 * 계산기 클래스를 만들고
	 * 더하기 빼기 곱하기 나누기를 수행하는 클래스를 만드세요
	 * 
	 * int 타입의 필드 : a,b
	 * int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 
	 * 리턴함
	 * 
	 * 실행 )
	 * 두 정수와 연산자를 입력하세요 >>
	 * 5 7 *
	 * 35
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 >> ");
		Calculator c1 = new Calculator();
		c1.a = sc.nextInt();
		c1.b = sc.nextInt();
		char opt = sc.next().charAt(0);
		System.out.println(c1.calculate(c1.a, c1.b, opt));
	}
}
