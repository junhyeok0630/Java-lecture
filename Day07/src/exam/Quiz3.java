package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 1~100까지의 수중 짝수들의 합계를 구하세요 !!
		 */
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("짝수들의 합 : " + sum);
	}
}
