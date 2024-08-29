package exam;


import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1; // 1 ~ 100 랜덤 숫자 생성
		
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.");
		System.out.println(com); // 프로그램 정상작동 확인용
		int count = 1; // 맞추는데 걸린 횟수, 최초입력에 맞출 수 있으니 1로 설정
		while(true) { // 사용자가 맞추는 순간까지 프로그램이 실행되어야 하므로 무한루프 사용
			try {
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
			} catch(Exception e) {
				System.out.println("다시 입력해주세요!!");
				sc.nextLine();
			}
			
		}
	}
}
