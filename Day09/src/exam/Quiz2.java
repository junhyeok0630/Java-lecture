package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 다음 배열에서 짝수들만 출력하세요
		 */
		int arr[] = {80,50,25,11,23,41,800,100};
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			} else {
				continue;
			}
		}
	}
}
