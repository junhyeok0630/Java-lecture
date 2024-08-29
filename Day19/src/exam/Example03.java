package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * Map
		 * - key(키), value(값)으로 구분하여 데이터를 저장하는 방식
		 * - Map의 구현 클래스로는 HashMap, LinkedHashMap, HashTable이 있다.
		 * - 키값은 중복이 불가능 value 값은 중복이 가능
		 * - HashMap은 데이터의 순서가 보장되지 않는다
		 * - HashMap의 순서를 보장하고 싶은 경우 LinkedHashMap을
		 * 활용하면 된다 !!
		 */
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("grape", "포도");
		// System.out.println(dic);
		
		// 사용자로부터 영어 단어를 입력받고 한글단어 검색
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾을 단어 >> ");
			String find_word = sc.next();
			if(find_word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			// 입력받은 값이 map에 없으면 null리턴
			String word = dic.get(find_word);
			if(word == null) {
				System.out.println(find_word + "는 없는 단어입니다.");
			} else {
				System.out.println(word);
			}
		}
	}
}
