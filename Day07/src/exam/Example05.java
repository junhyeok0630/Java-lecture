package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 무한루프
		 * - 말 그대로 무한히 반복됨
		 */
		int i = 0;
		while(true) {
			System.out.println(i);
			if(i == 100) {
				System.out.println("프로그램 종료");
				break;
			}
			i++;
		}
	}
}
