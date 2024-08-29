package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 수중 짝수들만 출력하는 프로그램을 작성하세요 !!~~
		 */
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
