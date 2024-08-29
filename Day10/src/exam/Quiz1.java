package exam;


public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 4 X 4의 2차원 배열을 만들고 이 배열에
		 * 1 ~10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를
		 * 배열에 저장하고 2차원 배열을 화면에 출력하세요
		 */
		int arr[][] = new int[4][4]; // 배열 생성
		for(int i = 0; i < arr.length; i++) { // 각 행의
			for(int j = 0; j < arr[i].length; j++) { //각 열에
				arr[i][j] = (int)(Math.random() * 10) + 1; //1~10까지의 랜덤 값 대입
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]); // 출력
			}
			System.out.println();
		}
	}
}
