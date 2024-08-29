package rectangle;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		/*
		 * Rectangle 클래스를 생성하여 가로와 세로를 필드로 선언하고 사각형의 넓이를 구하세요
		 * 
		 * 가로입력 >> 10
		 * 세로입력 >> 20
		 * 사각형의 면적은 : 200
		 */
		Scanner sc = new Scanner(System.in);
		Rectangle A = new Rectangle();
		System.out.print("가로입력 >> ");
		A.width = sc.nextInt();
		System.out.print("세로입력 >> ");
		A.length = sc.nextInt();
		System.out.print("사각형의 면적은 : " + A.getArea());
	}
}
