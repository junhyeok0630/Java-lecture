package exam;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		switch(num % 2) {
		case 1:
			System.out.println("홀수");
			break;
		case 0:
			System.out.println("짝수");
			break;
		}
	}
}
