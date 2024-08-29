package exam;

public class Example06 {
	public static void main(String[] args) {
		int i = 0;
		for(i = 1; i <= 10; i++) {
			System.out.println("나무를 " +i+ "번 찍었습니다.");
			if(i == 10) {
				System.out.println("나무넘어갑니다.");
			}
		}
	}
}
