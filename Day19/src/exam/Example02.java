package exam;

import java.util.LinkedList;

public class Example02 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		list.addFirst(100); // 리스트의 가장 앞에 데이터가 추가
		list.addLast(200); // 리스트의 가장 뒤에 데이터가 추가
		System.out.println(list);
		
		list.add(1,150);
		System.out.println(list);
		
		// 값 삭제
		list.remove(1);
		System.out.println(list);
		
		list.remove(Integer.valueOf(200));
		System.out.println(list);
		
		list.set(0, 10);
		System.out.println(list);
		
		// 리스트 전부 삭제
		list.clear();
		System.out.println(list);
		
		/*
		 * ArrayList, LinkedList 차이
		 * - 요소의 추가, 삭제, 검색 등의 작업에 따라 성능 특성이 다르다
		 * - 요소의 추가와 삭제가 자주 발생하는 경운에는 LinkedList
		 * - 요소의 접근이 자주 필요한 경우(즉 검색)은 ArrayList
		 */
	}
}
