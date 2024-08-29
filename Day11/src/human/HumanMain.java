package human;

public class HumanMain {
	public static void main(String[] args) {
		Human human1 = new Human();
		human1.name = "최준혁";
		human1.age = 23;
		human1.address = "창원시 성산구";
		
		Human human2 = new Human();
		human2.name = "홍길동";
		human2.age = 500;
		human2.address = "서울시 서초구";
		
		System.out.println("이름 : " + human1.name);
		System.out.println("나이 : " + human1.age);
		System.out.println("주소 : " + human1.address);
		
		System.out.println("이름 : " + human2.name);
		System.out.println("나이 : " + human2.age);
		System.out.println("주소 : " + human2.address);
	}
}
