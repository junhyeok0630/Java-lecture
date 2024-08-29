package exam;

public class Quiz4 {
	public static void main(String[] args) {
		int arr[] = {10,5,2,4,7,20,3,30};
		
		// 다음 arr 배열에서 짝수만 출력하세요
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.printf("%d ", arr[i]);
			} else {
				continue;
			}
		}
	}
}
