package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 배열을 생성하기 위해서는 new와 함께 자료형과 길이를 지정한다.
		 * 
		 * 형식)
		 * int[] arr = new int[크기]
		 */
		int arr1[] = new int[4];
		int arr2[] = {1,2,3,4,5};
		//System.out.println(arr1);
		//System.out.println(arr2);
		for(int i = 0; i < arr2.length; i++) { //for문을 사용해 배열 내 데이터가 저장된 각각의 index에 접근
			System.out.printf("%d ", arr2[i]); // 그 index에 저장된 데이터 값 출력
		}
	}
}
