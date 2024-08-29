package exam;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		/*
		 * 아이디와 비밀번호를 입력받아
		 * 아이디가 admin
		 * 비밀번호가 1234
		 * 로 입력받으면 로그인 성공
		 * 
		 * 만약 아이디를 잘못입력하였으면
		 * "아이디를 잘못입력하엿습니다."
		 * 만약 비밀번호를 잘못입력하였으면
		 * "비밀번호를 잘못입력하였습니다." 를 출력해주는 프로그램 작성
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력 >> ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 >> ");
		String password = sc.nextLine();
		
		if (!id.equals("admin")) { // id가 admin이 아닌경우
			System.out.println("아이디를 잘못입력하엿습니다."); // 아이디 오류
		} else if(!password.equals("1234")) { // 비밀번호가 1234가 아닌경우
			System.out.println("비밀번호를 잘못입력하엿습니다."); // 비밀번호 오류
		} else if (id.equals("admin") && password.equals("1234")) { // 둘다 맞을 경우
			System.out.println("로그인 성공"); // 로그인 성공
		}
		
	}
}
