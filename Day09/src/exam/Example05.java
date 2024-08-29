package exam;

public class Example05 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3]; // 2차원 배열 생성 2행 3열
		arr[0][0] = 1; 
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		for(int i = 0; i < arr.length; i++) { // 열 길이
			for(int j = 0; j < arr[i].length; j++) { // 행의 길이
				System.out.printf("%d\t", arr[i][j]); // 각 행렬값 출력
			}
			System.out.println();
		}
		
		System.out.println("행의 크기 : " + arr.length);
		System.out.println("열의 크기 : " + arr[0].length);
		System.out.println("열의 크기 : " + arr[1].length);
	}
}
