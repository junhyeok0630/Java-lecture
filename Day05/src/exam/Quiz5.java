package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 초등학교에서 중간고사 시험을 보았다.
		 * 시험성적이 70점 이상이면 합격 70점 미만이면 불합격을 출력하고
		 * 점수가 0미만 100점 초과시
		 * "입력범위를 초과하였습니다."라는 문구를 출력하세요!!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 >> ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("입력범위를 초과하였습니다.");
		} else if(score >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
