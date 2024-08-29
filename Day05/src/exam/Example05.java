package exam;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * if ~ else if
		 * 
		 * 형식)
		 * if(조건식) {
		 * 		코드..
		 * } else if (조건식) {
		 * 		코드..
		 * } else if (조건식) {
		 * 		코드..
		 * } else {
		 * 		코드..
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴입력 >> ");
		int menu = sc.nextInt();
		
		if (menu == 1) { // menu 값이 1일때
			System.out.println("콜라");
		} else if (menu == 2) { // menu 값이 2일때
			System.out.println("사이다"); 
		} else if (menu == 3) { // menu 값이 3일때
			System.out.println("환타");
		} else { // menu 값이 1,2,3 외 일때
			System.out.println("메뉴를 잘못입력하셨습니다.");
			System.out.println("다시 입력해 주세요!!");
		}
	}
}
