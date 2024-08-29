package point;

public class PointMain {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10); // Point의 멤버
		p.setY(20); // Point의 멤버
		p.showPoint(); // Point의 메소드
		//p.showColorPoint(); // Point클래스는 ColorPoint에 선언된 메소드 사용불가능
		
		ColorPoint cp = new ColorPoint();
		cp.setX(30); // Point의 멤버
		cp.setY(40); //Point의 멤버
		cp.setColor("검은색"); //ColorPoint의 Setter메소드
		cp.showPoint(); // Point의 메소드
		cp.showColorPoint(); // ColorPoint의 메소드
	}
}
