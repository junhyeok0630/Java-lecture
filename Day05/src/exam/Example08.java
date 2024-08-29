package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		String s1 = sc.nextLine();
		
		if (s1 == "apple") {
			System.out.println("같음");
		} else if (s1 != "apple") {
			System.out.println("같지않음");
		}
	}
}
