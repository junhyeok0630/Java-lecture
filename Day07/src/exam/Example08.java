package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * continue 문
		 * - 반복문 안에서 continue문을 만나면 이후의 실행 코드는 
		 * 수행되지 않고 반복문의 처음으로 돌아가 반복문을 실행한다.
		 */
		int i = 0;
		while(i < 100) {
			i++;
			if(i % 2 == 0) { // 짝수면
				continue; // 처음으로 돌아가기
			}
			System.out.println(i); // 홀수만 출력
		}
	}
}
