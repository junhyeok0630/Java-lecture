package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 서식문자
		 * %d : 정수(10진수)
		 * %o : 정수(8진수)
		 * %x : 정수(16진수)
		 * %f : 실수
		 * %e : 지수(e표기 기반)
		 * %g : 출력 대상에 따라 %e 또는 %f 형태로 출력
		 * %s : 문자열
		 * %c : 문자
		 * 
		 * 제어문자
		 * \n : 줄 바꿈
		 * \t : 탭 기능
		 * \' : 출력문에 작은 따옴표를 쓰기 위해
		 * \" : 출력문에 큰 따옴표를 쓰기 위해
		 */
		
		// 정수 출력
		System.out.printf("저는 대학교 %d 학년에 재학중입니다.\n", 3);
		
		// 2가지 이상의 서식문자를 이용해 데이터를 출력
		System.out.printf("%d 첫번째 %d 두번째 %d 세번째\n", 10,20,30);
		
		// 지정한 숫자만큼 공간을 확보한 후 오른쪽 정렬하여 출력
		System.out.printf("%5d\n", 10);
		System.out.printf("%10d\n", 10);
		System.out.printf("%30d\n", 10);
	}
}
