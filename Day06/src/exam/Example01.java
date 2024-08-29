package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩(if)
		 * - if문 안에 또 다른 if 문을 넣을 수 있다.
		 * 
		 * 형식)
		 * if(조건) {
		 * 		if(조건) {
		 * 			코드...
		 * 		} else {
		 * 			코드...
		 * 		}
		 * } else {
		 * 		코드...
		 * }
		 */
		int score = 77;
		if(score >= 90) { // 90보다 큰 점수 중에
			if(score >= 95) {
				System.out.println("A+학점"); // 95점보다 크면 A+
			} else {
				System.out.println("A학점"); // 그 아래면 A
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		} else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점");
			} 
		} else if(score >= 60) {
			if(score >= 65) {
				System.out.println("D+학점");
			} else {
				System.out.println("D학점");
			}
		} else {
			System.out.println("F학점");
		}
	}
}
