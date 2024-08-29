package exam;

public class Example03 {
	
	public static void printHello() {
		System.out.println("Hello Java");
	}
	
	public static void main(String[] args) {
		/*
		 * 메소드(Method)
		 * - 클래스 안에서 특정 기능을 수행하기 위해 코드들을 따로
		 * 하나의 블록로 묶어놓은 것
		 * - 메소드를 사용하면 같은 내용의 코드를 반복적으로 사용하는 걸
		 * 피할 수 있다.
		 * 즉) 반복되는 문장들을 묶어서 처리하면 필요할 때마다 재 사용이 
		 * 가능하며 중복코드를 제거할 수 있다.
		 *
		 * 형식 )
		 * 접근제한자 반환타입 메소드이름() {
		 * 		실행코드...
		 * }
		 */
		printHello();
	}
}
