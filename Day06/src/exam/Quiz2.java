package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/* 
		 * 연산 기호에 따라(덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/)을 하는
		 * 사칙연산을 하는 프로그램을 작성하세요
		 * 숫자는 int형으로 입력!!
		 * 
		 * 숫자입력 >> 3
		 * 기호입력 >> +
		 * 숫자입력 >> 3
		 * 결과 : 6
		 * 
		 * 숫자 입력 >> 10
		 * 기호 입력 >> %
		 * 숫자입력 >> 20
		 * 기호를 잘못입력하였습니다.
		 * 
		 * char형 입력방법
		 * char 변수명 = Scanner.next().charAt(0)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("기호입력 >> ");
		char oper = sc.next().charAt(0);
		System.out.print("숫자입력 >> ");
		int num2 = sc.nextInt();
		
		// if 문으로 풀이
		/*if (oper == '+') {
			int result = num1 + num2;
			System.out.println("결과 : " + result);
		} else if (oper == '-') {
			int result = num1 - num2;
			System.out.println("결과 : " + result);
		} else if (oper == '*') {
			int result = num1 * num2;
			System.out.println("결과 : " + result);
		} else if (oper == '/') {
			int result = num1 / num2;
			System.out.println("결과 : " + result);
		} else {
			System.out.println("기호를 잘못입력하였습니다.");
		}*/
		
		// switch 문으로 풀이
		switch(oper) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("기호를 잘못 입력하셨습니다.");
		}
	}
}
