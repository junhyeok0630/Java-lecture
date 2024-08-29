package exam;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 숫자하나를 입력받아 입력받은 수의
		 * 십의 자리와 일의 자리를 구분하여 출력해 주세요
		 * 
		 * 입력 >> 16
		 * 출력결과)
		 * 십의 자리 : 1
		 * 일의 자리 : 6
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int tens = num / 10; // 나누기 연산자로 10의 자리 연산
		int ones = num % 10; // 나머지 연산자로 1의 자리 연산
		System.out.println("십의 자리 : " + tens);
		System.out.println("일의 자리 : " + ones);
	}
}
