package exam;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * throws - 예외 던지기
		 * - 메소드 내부에서 예외가 발생할 수 있는 것을 대비하여
		 * try ~ catch 블록으로 에외를 처리한다.
		 * 그러나 경우에 따라서는 throws 키워드를 사용해 메소드를 호출한
		 * 곳을 예외로 떠넘길 수 있다.
		 */
		try {
			findClass();
		} catch(Exception e) {
			System.out.println("존재하지 않는 클래스입니다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cla = Class.forName("Java.lang.string");
	}
}
