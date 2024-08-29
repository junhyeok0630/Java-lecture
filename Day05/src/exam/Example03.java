package exam;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * x && y : x와 y가 모두 참이어야 참
		 * x || y : x와 y 둘 중 하나가 참이면 참
		 * !x : x가 거짓이면 참
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액입력 >> ");
		int money = sc.nextInt();
		boolean card = true;
		
		if (money >= 3000 || card) { // 돈이 3000원이 있거나(OR), 카드가 있을 경우 (카드값 = true이므로 돈을 적게 입력해도 택시를 탐)
			System.out.println("택시를 타고 가라");
		} else {
			System.out.println("걸어가라");
		}
	}
}
