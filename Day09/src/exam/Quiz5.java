package exam;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 주어진 배열의 전체 원소들의 합과 평균값을 출력하세요
		 * 
		 * 결과)
		 * 합계 : 615
		 * 평균 : 68.3333333333.....
		 */
		int[][] arr = {
				{93,56,43},
				{83,71},
				{96,54,22,97}
		};
		int sum = 0;
		int sub = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			sub = sub + arr[i].length;
		}
		double avg = sum / (double)sub;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
