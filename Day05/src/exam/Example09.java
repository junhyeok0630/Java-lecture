package exam;

public class Example09 {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if (str1 == str2) { 
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str1.equals(str2)) { 
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		/*
		 *  == : 객체가 같은지를 비교하지만 객체가 가지고 있는 문자열을 비교하지 않는다.
		 *  ㄴ 두 객체의 메모리 참조값이 다르기 때문에 다른 객체로 취급한다.
		 *  
		 *  equals() : 문자열 데이터 값 그 자체를 비교한다.
		 */
	}
}
