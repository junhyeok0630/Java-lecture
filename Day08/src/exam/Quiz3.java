package exam;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를
		 * 구해서 (x,y)형태로 출력해보세요
		 * 단 x,y는 10이하의 자연수 입니다.
		 * 
		 * 답)
		 * (5,8)
		 * (10,4)
		 * 
		 */
		for(int x = 1; x <= 10; x++) { // x에 1부터 10까지 대입
			for (int y = 1; y <= 10; y++) { // 각 x값에 대해 y에 1부터 10까지 대입
				int result = 4 * x + 5 * y;
				if(result == 60) { // 식을 만족할 경우만
					System.out.println("(" + x + "," + y + ")"); // 방정식의 해 출력
				} else { // 만족하지 않으면
					continue; // 반복문 마저 실행
				}
			}
		}
	}
}
