package exam;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int[] card = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 뽑으시겠습니까 >> ");
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 :" + card[cardIndex]);
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
		}
		
	}
}
