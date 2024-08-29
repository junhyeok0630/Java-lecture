package exam;

class Coffee {
	public void make() {}
}

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 익명클래스
		 * - 이름이 없는 클래스를 의미
		 * - 클래스의 선언과 객체의 생성을 동시에 하므로 단 한번만 사용할 수 
		 * 있고, 오직 하나의 객체만을 생성할 수 있는 일회용 클래스
		 * - GUI 개발에 사용한다.
		 */
		
		Coffee coffee = new Coffee() {
			@Override
			public void make() {
				System.out.println("Override Make !!");
			}
			
			/*
			 * new Coffee()를 통해 생성되는 인스턴스는 Coffee 클래스가 
			 * 아닌 상단에 Coffee 클래스를 상속받는 익명 클래스이기 때문에
			 * Coffee 클래스 안에 serve() 메소드가 선언되어 있지 않기 때문이다.
			 */
			public void serve() {
				System.out.println("Serve");
			}
		};
		coffee.make();
//		coffee.serve();
	}
}
