package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 출력문
		 * System.out.println()
		 * - 괄호 안의 내용을 출력하고 행을 바꾼다. (자동개행)
		 * 
		 * System.out.print()
		 * - 괄호 안의 내용을 출력(자동개행 안됨)
		 * 
		 * System.out.printf()
		 * - 문자열을 서식 문자로 이용해 형식화된 내용을 출력(자동개행 안됨)
		 */
		// 한 문장을 출력후 개행되어 출력되는 예
		System.out.println("A");
		System.out.println("B");
		System.out.println();
		
		// 두 문장을 연속적으로 출력하는 예
		System.out.print("Welcome ");
		System.out.print("Java world");
	}
}
