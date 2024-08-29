package exam;

public class Example12 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int result1 = 10 + (--a); // a = 0
		int result2 = 10 + (b--); // b = 1
		System.out.println(result1);
		System.out.println(result2);
	}
}
