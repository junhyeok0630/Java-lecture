package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 국어점수 85점
		 * 수학점수 85점
		 * 영어점수 75점
		 * 국사점수 88점
		 * 
		 * 네 과목의 합계(정수)와 평균(실수) 를 출력하세요
		 */
		int kor = 85;
		int math = 85;
		int eng = 75;
		int his = 88;
		
		int sum = kor + math + eng + his;
		// 산술연산자가 대입연산자 보다 우선이므로 sum/4의 값이 int의 값으로 연산된 후 avg에 대입된다.
		// 따라서 연산 전 형변환으로 산술연산에서 double 값이 반환될 수 있도록 해준다.
		double avg = (double) sum / 4; 
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
	}
}
