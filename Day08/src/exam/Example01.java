package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문
		 * - 바깥쪽 반복문
		 * - 안쪽 반복문
		 * 
		 * for문을 중첩해서 사용할 수록 효율이 나빠진다.
		 * 반복문이 중첩될수록 반복문을 위한 연산의 부하가 커진다.
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식) {
		 * 		for(초기식; 조건식; 증감식) {
		 * 
		 * 		}
		 * }
		 * 안쪽 for문의 반복이 끝나야 바깥쪽 for문 실행
		 */
		for(int i = 2; i <= 9; i++) { // 2단부터 9단까지
			for(int j = 1; j <= 9; j++) { // 각 단마다 1부터 9까지
				System.out.println(i + " x " + j + " = " + i*j); // 곱하기 연산 실행
			}
			System.out.println();
		}
	}
}
