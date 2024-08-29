package test1;

public class Test {
	protected String protected_name; // 같은 패키지 또는 자식 클래스
	public String public_name; // 어디서든
	private String private_name; // 외부에서 접근 불가능
	String default_name; // 같은 패키지에 소속된 클래스
	
	// Getter Setter 단축키 : Alt + Shift + s
	public String getPrivate_name() {
		return private_name;
	}
	public void setPrivate_name(String private_name) {
		this.private_name = private_name;
	}
}
