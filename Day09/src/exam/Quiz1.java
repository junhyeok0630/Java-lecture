package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 인덱스가 3번인 곳은
		 * 출력하지 말고 나머지만 출력하세요
		 * 
		 * 입력 >> 10
		 * 입력 >> 20
		 * 입력 >> 30
		 * 입력 >> 40
		 * 입력 >> 50
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 >> ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(arr[i] + " ");
		}
	}	
}
