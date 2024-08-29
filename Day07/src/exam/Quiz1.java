package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력받아 입력 받은 수 까지 출력하는 
		 * 프로그램을 작성하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
