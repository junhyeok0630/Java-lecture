package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		// 입력을 받아서 배열에 값을 할당하기
		int arr[] = new int[4];
		Scanner sc = new Scanner(System.in);
		// 출력과 마찬가지로 입력 또한 각 배열의 인덱스에 직접 접근해 값을 대입해야한다.
		for(int i = 0; i < arr.length; i++) { // index 0 부터 배열의 길이까지
			System.out.println(i + 1 + "째 입력 >> ");
			arr[i] = sc.nextInt(); // 입력 받은 숫자를 대입
		}
		
		for(int i = 0; i < arr.length; i++) { // index 0 부터 배열의 길이까지
			System.out.printf("%d ", arr[i]); // 저장된 숫자를 출력
		}
	}
}
