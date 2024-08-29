package exam;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
		 * 사용자는 이 숫자를 맞추어야 합니다. 입력한 숫자보다 정답이 크면 → "UP" 출력, 
		 * 입력한 숫자보다 정답이 작으면 → "DOWN" 출력. 정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
		 * 실행예시) 
		 * (예시) 컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.
		 * 1~100 숫자 입력:50 DOWN
		 * 1~100 숫자 입력:25 UP
		 * 1~100 숫자 입력:38 DOWN
		 * 1~100 숫자 입력:32 UP
		 * 1~100 숫자 입력:35 UP
		 * 1~100 숫자 입력:37 DOWN
		 * 1~100 숫자 입력:36
		 * 정답입니다! 7회 만에 맞췄어요.
		 */
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1; // 1 ~ 100 랜덤 숫자 생성
		
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.");
		System.out.println(com); // 프로그램 정상작동 확인용
		int count = 1; // 맞추는데 걸린 횟수, 최초입력에 맞출 수 있으니 1로 설정
		while(true) { // 사용자가 맞추는 순간까지 프로그램이 실행되어야 하므로 무한루프 사용
			System.out.print("1~100 숫자 입력:");
			int user = sc.nextInt(); // 숫자 입력
			if(user < com) { // 랜덤숫자가 입력받은 숫자보다 클 경우
				System.out.println("UP"); // UP 출력
			} else if(user > com) { // 랜덤숫자가 입력받은 숫자보다 작은 경우
				System.out.println("DOWN"); // DOWN 출력
			} else if (user == com) { // 두 숫자가 같은 경우
				System.out.println("정답입니다!" + count + "회 만에 맞췄어요."); // 횟수 출력
				break; // 무한루프 탈출
			}
			count++; // 횟수증가
		}
	}
}
