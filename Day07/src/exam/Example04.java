package exam;

public class Example04 {
	public static void main(String[] args) {
		int i = 1; // 초기식
		int sum = 0;
		// 1~100까지의 합 구하기
		while(i <= 100) {
			sum = sum + i; // sum에 i값 더하기
			i++; // i 1증가
		}
		System.out.println("1~100까지의 합 : " + sum);
	}
}
