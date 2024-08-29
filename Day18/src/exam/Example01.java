package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * indexOf()
		 */
		
		String str = "HelloWorld_MyWorld";
		// 처음 위치에서 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World"));
		
		// 10번째 위치부터 검색
		System.out.println("World 단어 위치 : " + str.indexOf("World", 10));
		
		String indexOfTest = "Hello World";
		System.out.println();
	}
}
