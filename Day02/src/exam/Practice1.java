package exam;

public class Practice1 {
	public static void main(String[] args) {
		int age = 20;
		double height = 170;
		String name = "Choi"; // 디버깅 창의 (id(23)가 객체 Choi의 참조값)
		String job = "Student";// 디버깅 창의 (id(31)가 객체 Student의 참조값)
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(job);
		
		// Sting타입의 선언은 사실 아래 구문의 함축된 구문이다.
		String name1 = new String("홍길동"); // new는 객체를 생성할 때 사용한다.
		System.out.println(name1);
	}
}
