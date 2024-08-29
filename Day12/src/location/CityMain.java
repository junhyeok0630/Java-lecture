package location;

class City {
	
	public String name = "홍길동";
	public String city; // 도시명
	public String gu; // 무슨구
	public String dong; // 무슨동
	
	public City(String a, String b, String c) { // 생성자 메소드
		city = a;
		gu = b;
		dong = c;
	}
}

public class CityMain {
	public static void main(String[] args) {
		City city1 = new City("서울시", "서초구", "방배동");// 생성자 메소드를 통해 객체 생성
		System.out.println(city1.name + "은");
		System.out.println(city1.city);
		System.out.println(city1.gu);
		System.out.println(city1.dong + "에 산다.");
		
		System.out.println();
		City city2 = new City("부산시", "부산진구", "범일동"); // 생성자 메소드를 통해 객체 생성
		city2.name = "김길동"; // 객체의 name 필드 값 변환
		System.out.println(city2.name + "은");
		System.out.println(city2.city);
		System.out.println(city2.gu);
		System.out.println(city2.dong + "에 산다.");
	}
}	
