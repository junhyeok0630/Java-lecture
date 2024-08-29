package exam;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * switch문
		 * - switch문은 먼저 식을 계산하고 그 결과 값과 일치하는 
		 * case문으로 분기
		 * - case문의 실행할 문장을 실행한 후 break를 만나면
		 * switch문을 탈출한다.
		 * - default는 생략할 수 있다 만약 switch문안에 case 조건이 
		 * 걸리지 않는다면 default로 빠진다.
		 * 
		 * break문
		 * - break문은 반복문인 for문, while문, do~while문의 실행을
		 * 중지시키거나 switch문을 중지시키기 위해 사용된다.
		 * - 만약 특정조건을 만나면 다음 실행문이 존재하더라도 강제로 나감
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: // 1 입력 시 가위
			System.out.println("가위");
			//break; // switch 문 탈출
		case 2: // 2 입력 시 바위
			System.out.println("바위");
			//break;
		case 3: // 3 입력 시 보
			System.out.println("보");
			//break;
		default: // 나머지 숫자 입력 시 잘못된 입력 출력
			System.out.println("잘못입력하셨습니다...");
			//break;
		}
	}
}
