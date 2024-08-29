package exam;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 다음 배열의 요소에서 최대값과 최소값을 구하세요
		 */
		int arr[] = {50,100,900,250,3,7,25,40}; // 배열선언
		int max = arr[0]; // 최대값을 0번째 인덱스 값으로 임시 설정
		int min = arr[0]; // 최소값을 0번째 인덱스 값으로 임시 설정
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i] > max) { // 배열 내 i번째 인덱스에 저장된 값이 max보다 크면
				max = arr[i]; // 최대값 교체
			}else if( arr[i] < min) { // // 배열 내 i번째 인덱스에 저장된 값이 min보다 작으면
				min = arr[i]; // 최소값 교체
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
