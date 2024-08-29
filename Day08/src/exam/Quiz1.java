package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int remain = 0;
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔금 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print(">> ");
			int func = sc.nextInt();
			if (func == 1) {
				System.out.print("예금액 : ");
				int incash = sc.nextInt();
				remain = remain + incash;
				continue;
			} else if (func == 2) {
				System.out.print("출금액 : ");
				int outcash = sc.nextInt();
				if (remain > outcash) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				remain = remain - outcash;
				continue;
			} else if (func == 3) {
				System.out.println("잔고 : " + remain);
				continue;
			} else if (func == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 기능입니다.");
				continue;
			}
		}
		
	}
}
