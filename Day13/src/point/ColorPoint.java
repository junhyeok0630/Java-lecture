package point;

public class ColorPoint extends Point{ // Point 클래스 상속
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(this.color);
		showPoint(); // Point 클래스의 showPoint() 메소드 호출
	}
}
