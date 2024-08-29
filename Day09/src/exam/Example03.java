package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * char 배열에서 단어만 추출하기
		 * 실행결과 ) LOVE
		 */
		char[] cards = {'1','L','O','2','V','3','E'}; // 배열 선언
		for(int i = 0; i < cards.length; i++) { // 배열 인덱스에 접근
			if(cards[i] >= 65 && cards[i] <= 90) { // 유니코드 값이 알파벳인 것만 
				System.out.printf("%c", cards[i]); // 출력
			}
		}
		
		/*int[] arr = {10,20,30,40,50,70,80};
		// 다음 배열에서 인덱스가 3인 곳에 접근하여 해당 인덱스에
		// 저장된 데이터를 출력!!
		for(int i = 0; i < arr.length; i++) {
			if(i == 3) {
				System.out.println(arr[i]);
			}
		}*/
	}
}
