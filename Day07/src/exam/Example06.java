package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * for문에서의 무한루프
		 * - 조건식을 생략하면 된다
		 * 
		 * 
		 */
		for(int i = 0; ;i++) {
			System.out.println(i);
			if(i == 10) {
				break;
			}
		}
		
		/*
		 * while문과 for문
		 * 
		 * for문
		 * - 구하고자 하는 값의 조건이 무엇인지 명확할 경우 사용하는 것이 좋다.
		 * - 또한 초기갑, 조건식, 증감식이 while문과 달리 블록에서 바로 찾을 수 
		 * 있어 가독성이 좋다.
		 * 
		 * while문
		 * - 구하고자 하는 값의 조건을 정확하게 모를 경우, 즉 유동적인 경우에
		 * 사용하면 좋다.
		 * - 조건식이 한곳에 있지 않아 가독성이 나쁘다.
		 */
	}
}
