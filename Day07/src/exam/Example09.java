package exam;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 난수생성 => Math.random()
		 * - Math.random() 함수는 double형으로 0.0 이상 1.0 미만
		 * 사시의 값을 반환하는 함수임
		 * - 난수를 생성하고 싶을 때 주로 사용하면 되고 실수형이라 
		 * 정수형으로 형 변환을 해줘야 함
		 */
//		System.out.println(Math.random());
		
		// 1 ~ 10까지의 숫자를 랜덤으로 생성
		System.out.println((int)(Math.random() * 10) + 1);
		//Math.random() * 10의 값이 0~9까지 이므로 1을 더해준다.
	}
}	
