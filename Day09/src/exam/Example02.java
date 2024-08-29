package exam;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 배열 안에 모든 값의
		 * 총합과 평균을 구하려면?
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		
		// 각 인덱스에 들려서 입력받은 값을 넣음
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 요소 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		// arr 배열 길이만큼 반복하여 해당 인덱스에 저장되어 있는
		// 값들을 모두 더하는 코드!!
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum / (double) arr.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
