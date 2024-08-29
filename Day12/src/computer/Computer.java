package computer;

public class Computer {
	/*
	 * 생성자 - this
	 * - 가독성으로 인해 매개변수의 이름은 필드의 이름과 비슷하거나 동일한 
	 * 이름을 상요하는 것이 관례이다.
	 * - 필드앞에 자기 참조 객체인 this를 사용
	 * - 필드와 매개 변수의 이름이 동일하면 생성자 내부에서 해당 필드에 
	 * 접근 못함 
	 */
	public String cpu;
	public int ram;
	
	public Computer(String cpu, int ram) { // 생성자 메소드
		this.cpu = cpu; // this.cpu : Computer 클래스의 필드, cpu : 매개변수
		this.ram = ram; // this.ram : Computer 클래스의 필드, ram : 매개변수
	}
}
