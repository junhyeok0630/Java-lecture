package exam;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		/*
		 * 나이를 입력받아 19세 이상이면 성인
		 * 13살 이상이면 청소년
		 * 6살 이상이면 초등학생
		 * 6살 미만이면 아기입니다를 출력하는 프로그램을 작성하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >>");
		int age = sc.nextInt();
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (age >= 13) {
			System.out.println("청소년입니다.");
		} else if (age >= 6) {
			System.out.println("초등학생입니다.");
		} else if (age < 0) {
			System.out.println("잘못된 나이입니다.");
		} else {
			System.out.println("아기입니다.");
		}
	}
}
