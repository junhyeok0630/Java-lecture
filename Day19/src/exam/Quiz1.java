package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 영문을 입력받아 엔터를 입력하면 입력한 영문을 소문자는 대문자로
		 * 대문자는 소문자로 변경하여 출력하는 프로그램을 작성하세요
		 * 단) 사용자가 END, end라는 문자열을 입력받으면 프로그램 종료
		 * 
		 * 입력 >>
		 * dfesDED
		 * 대소문자변환 : DFESded
		 * 입력 >>
		 * ...
		 * 입력 >>
		 * end
		 * 프로그램 종료 !!
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
//			System.out.println("입력 >>");
//			String s = sc.next();
//			char result[] = new char[s.length()];
//			if(s.equals("end") || s.equals("END")) {
//				System.out.println("프로그램 종료 !!");
//				break;
//			}
//			for(int i = 0; i < s.length(); i++) {
//				result[i] = s.charAt(i);
//				if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
//					int bigTemp = s.charAt(i) + 32;
//					result[i] = (char) bigTemp;
//				} else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//					int smallTemp = s.charAt(i) - 32;
//					result[i] = (char) smallTemp;
//				} else {
//					result[i] = s.charAt(i);
//				}
//			}
//			System.out.print("대소문자변환 : ");
//			for(int i = 0; i < result.length; i++) {
//				System.out.print(result[i]);
//			}
//			System.out.println();
			System.out.println("입력 >> ");
			String str = sc.nextLine();
			String change_str = "";
			if(str.equals("END") || str.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			for(char a : str.toCharArray()) {
				if(Character.isLowerCase(a)) {
					change_str = change_str + Character.toUpperCase(a);
				} else {
					change_str = change_str + Character.toLowerCase(a);
				}
			}
			System.out.println("대소문자 변환 : " + change_str);
			System.out.println();
		}
	}
}
