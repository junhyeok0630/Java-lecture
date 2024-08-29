package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 수를 입력받아 1부터 입력받은 수까지의 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) { // 조건식의 범위를 입력받은 숫자까지 지정
			sum = sum + i; // sum 변수에 1씩 증가하는 i의 값을 반복문 실행마다 더해준다.
		}
		System.out.println("1부터 입력받은 수까지의 합 : " + sum);
	}
}
