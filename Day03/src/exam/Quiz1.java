package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 자신의 나이, 이름, 학교, 거주지를 입력받아 
		 * 출력하는 프로그램을 작성하세요
		 * 
		 * 출력결과는 콘솔창에 한줄로 출력하도록 하세요 !!~~
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >> ");
		int age = sc.nextInt(); // 입력 값 중 enter나 공백을 기준으로 그 앞의 int형 값을 가져온다.
		System.out.println("이름을 입력하세요 >> ");
		sc.nextLine(); // 위의 nextint에서 입력 값중 정수를 제외하고 enter값이 남아 있기 때문에 nextline메서드를 이용해 날려준다.
		String name = sc.nextLine(); // 저장된 입력값이 없고 다시 새로 입력 받는다.
		System.out.println("학교를 입력하세요 >> ");
		String univ = sc.nextLine();
		System.out.println("주소를 입력하세요 >> ");
		String addr = sc.nextLine();
		System.out.println("저의 나이는 " + age + "살이고, "
							+ "이름은 " + name 
							+ ", 학교는 " + univ + "이며, "
							+ addr + "에 살고 있습니다.");
	}
}
