package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 구구단중 짝수단만 출력하세요
		 * 2,4,6,8 단을 출력
		 */
		for(int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}
