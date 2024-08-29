package student;

public class Student {
	static String schooLName = "코리아 고등학교"; // 정적 필드 선언
	String studentName;
	
	static void goToSchool() { // 정적 메소드 선언
		System.out.println("학교에 간다");
	}
	
	void hello() {
		System.out.println("제 이름은 " + studentName + "입니다.");
	}
}
