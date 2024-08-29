package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 다중예외처리
		 */
		try {
			Scanner sc = new Scanner(System.in);
			int[] card = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 뽑으시겠습니까 >> ");
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 :" + card[cardIndex]);
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
		}
	}
}
