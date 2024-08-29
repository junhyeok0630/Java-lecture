package exam;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * Scanner를 이용하여 한 라인을 읽고 공백으로 분리된 어절이 몇 개 
		 * 들어 있는지
		 * "그만"을 입력할 때까지 반복하는 프로그램을 작성하세요
		 * 
		 * 입력 >> I love Java
		 * 어절개수 3
		 * 입력 >> 자바는 객체 지향 언어로써 매우 좋은 언어이다.
		 * 어절개수 7
		 * 입력 >> 그만
		 * 종료합니다..
		 */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("입력 >> ");
			String str = sc.nextLine();
			StringTokenizer tokens = new StringTokenizer(str, " ");
			if(str.equals("그만")) {
				System.out.println("종료합니다..");
				break;
			}
			System.out.println("어절개수 " + tokens.countTokens());
			String word[] = str.split(" ");
			System.out.println(word.length);
		}
	}
}
