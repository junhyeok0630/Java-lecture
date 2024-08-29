package exam;

public class Example07 {
	public static void main(String[] args) {
		int arr[] = new int[4]; // 4개의 공간을 가진 배열을 선언
		
		// 배열에 값 넣기
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
