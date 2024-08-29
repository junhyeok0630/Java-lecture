package exam;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * Getter와 Setter 메소드
		 * - 객체지향프로그래밍에서 객체의 데이터는 객체 외부에서
		 * 직접적으로 접근하는 것을 막는다.
		 * - 객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의
		 * 무결성이 깨진다.
		 * 
		 * 
		 * - 객체의 무결성을 유지하기 위해 메소드를 통해 데이터를 변경하게 
		 * 하여 검증된 값만 데이터로 저장할 수 있게 한다. => Setter(메소드)
		 * 
		 * - 데이터를 반환하는 역할을 하는 메소드 => Getter(메소드)
		 * 
		 * - private 필드의 값을 대입하는 방법으로는 Setter 메소드 사용
		 * - 반대로 private 필드의 값을 호출하려면 Getter 메소드를 사용
		 */
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setTitle("자바의 정석");
		System.out.println(book1.getTitle());
		book1.setAuthor("남궁성");
		System.out.println(book1.getAuthor());
		
		System.out.println("==============");
		book2.setTitle("열혈 C프로그래밍");
		System.out.println(book2.getTitle());
		book2.setAuthor("윤성우");
		System.out.println(book2.getAuthor());
	}
}
