package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 숫자를 계속 입력받아
		 * 입력받은 숫자들의 총 합을 구하세요
		 * 0을 입력하면 "프로그램 종료" 라는 메시지를 띄우고
		 * 프로그램 중지
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("숫자 입력 >> ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			sum = sum + num;
		}
		System.out.println("입력 받은 수의 총 합 : " + sum);
	}
}
