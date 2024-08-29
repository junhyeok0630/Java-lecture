package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * equals()
		 * - 두 개의 문자열이 동일한지 동일하지 않은지 판단
		 * - 모든 객체의 부모 클래스인 Object 클래스에 정의되어있는 메소드
		 * - 대소문자를 구분한다.
		 */
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2가 같습니다."); // 두 문자열이 다르므로 미실행
		} else if(str1.equals(str3)) {
			System.out.println("str1과 str3가 같습니다."); // 두 문자열이 같으므로 실행
		}
	}
}
