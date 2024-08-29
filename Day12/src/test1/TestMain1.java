package test1; // 동일한 패키지

public class TestMain1 {
	public static void main(String[] args) {
		Test test = new Test();
		
		// public 접근
		test.public_name = "홍길동"; 
		System.out.println(test.public_name);
		
		// protected 접근 - 같은 패키지의 클래스이므로 접근 가능
		test.protected_name = "김길동";
		System.out.println(test.protected_name);
		
		// default 접근 - 같은 패키지의 클래스이므로 접근  
		test.default_name = "김길순";
		System.out.println(test.default_name);
		
		// private 접근 - 외부 클래스에서 접근 불가능
		test.setPrivate_name("홍길동");
		System.out.println(test.getPrivate_name());
	}
}
