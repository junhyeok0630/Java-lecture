package exam;

public class Example04 {
	public static void main(String[] args) {
		int kor = 95;
		int eng = 46;
		double avg = (kor + eng) / 2.0;
		System.out.println(avg);
		if (avg >= 70) {
			System.out.println("두 과목의 평균점수가 70이상이므로");
			System.out.println("합격");
		} else {
			System.out.println("두 과목의 평균점수가 70미만이므로");
			System.out.println("불합격");
		}
	}
}
