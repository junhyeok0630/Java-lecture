package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력받아 입력 받은 수의 구구단을 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
}
