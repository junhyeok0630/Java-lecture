package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.powerOn(); // Samsung 클래스에서 오버라이딩된 메소드가 호출
		s.powrOff(); // Computer 클래스의 메소드가 호출
		
		System.out.println();
		
		Computer c = new Computer();
		c.powerOn();
		c.powrOff();
	}
}
