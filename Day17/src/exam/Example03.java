package exam;

public class Example03 {
	public static void main(String[] args) {
		try {
			String[] strArray = null;
			System.out.println("strArray[0] = " + strArray[0]); 
		} catch(NullPointerException e) {
			System.out.println("strArray 배열이 null이므로 "
					+ "개체 배열에서 로드 할 수 없습니다.");
		}
	}
}
