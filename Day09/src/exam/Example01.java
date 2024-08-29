package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 배열(array)
		 * - 같은 타입의 자료형을 여러개 저장할 수 있다.
		 */
		int arr[] = new int[5]; // heap 영역에 5만큼의 메모리 공간을 할당
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] str = {"사과", "포도", "바나나"};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		int list[] = null;
		list = new int[4];
		for(int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
