package exam;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * Scanner() : 사용자가 데이터를 입력받을 때 사용하는 클래스
		 * 
		 * 형식)
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * sc.nextByte() : byte형 입력 및 리턴
		 * sc.nextShort() : short형 입력 및 리턴
		 * sc.nextInt() : int형 입력 및 리턴
		 * sc.nextLong() : long형 입력 및 리턴
		 * 
		 * sc.nextFloat() : float형 입력 및 리턴
		 * sc.nextDouble() : double 형 입력 및 리턴
		 * 
		 * sc.next() : String형 입력 및 리턴 (공백을 기준으로 단어 하나을 읽어들임)
		 * sc.nextLine() : String형 입력 및 리턴 (개행을 기준으로 한 줄을 읽어들임)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println("숫자입력 >> ");
		double b = sc.nextDouble();
		System.out.println(b);
		
	}
}
