package exam;

public class Example03 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) { // 사각형의 세로 10줄동안
			i++;
			int j = 1;
			while(j <= 10) {// 각 세로 행마다 10개의
				j++;
				System.out.print("* "); // *출력
			}
			System.out.println();
		}
	}
}
