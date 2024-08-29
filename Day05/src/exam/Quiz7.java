package exam;

public class Quiz7 {
	public static void main(String[] args) {
		/*
		 * 100점 만점 중 100 ~ 90점이면 "A"
		 * 89 ~ 80 점이면 "B"
		 * 79 ~ 70 점이면 "C"
		 * 69 ~ 60 점이면 "D"
		 * 60점 미만이면 "F"를 출력하세요 
		 */
		int score = 72;
		if (score < 0 || score > 100) { // 점수가 0미만 100초과시
			System.out.println("잘못된 점수입니다."); // 잘못된 점수
		} else if (score > 90 && score <= 100) { // 90초과 100이하시
			System.out.println('A'); // A
		} else if (score > 80 && score <= 90) { // 80초과 90이하시
			System.out.println('B'); // B
		} else if (score > 70 && score <= 80) { // 70초과 80이하시
			System.out.println('C'); // C
		} else if (score > 60 && score <= 70) { // 60초과 70이하시
			System.out.println('D'); // D
		} else { // 그 이하
			System.out.println('F'); // F
		}
	}
}
