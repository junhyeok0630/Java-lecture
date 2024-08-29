package quiz;

import java.util.Scanner;

class Phone {
	private String name; // 이름
	private String tel; // 전화번호 
	
	public Phone(String name, String tel) { // 전화번호부에 명부를 추가하는 생성자
		this.name = name;
		this.tel = tel;
	}
	//Getter와 Setter메소드를 사용하여 클래스 외부에서 접근할 수 있도록 설정
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}

public class PhoneMain {
	public static void main(String[] args) {
		/*
		 * 1. 입력 | 2. 검색 | 3. 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		Phone phone[] = null; // 객체 배열 생성
		
		while(true) {
			System.out.println("1. 입력 | 2. 검색 | 3. 프로그램 종료");
			System.out.println("메뉴를 선택해 주세요 >> ");
			int choice = sc.nextInt();
			
			if(choice == 1) { // 전화번호부에 명단 추가
				System.out.println("인원수 >>"); // 몇명 추가 할 건지 이름 입력
				int count = sc.nextInt();
				phone = new Phone[count]; // 사람 수 만큼 객체 배열 초기화
				for(int i = 0; i < count; i++) { // 배열을 돌면서
					System.out.println("이름과 전화번호 입력 >> ");
					String name = sc.next();
					String tel = sc.next();
					phone[i] = new Phone(name, tel); // 전화번호부 명단 객체 생성
				}
			} else if (choice == 2) { // 전화번호부 검색
				System.out.println("검색할 이름 >>");
				String search_name = sc.next();
				boolean found = false; // 찾았는지에 대한 값을 false로 지정
				for(int i = 0; i < phone.length; i++) { // 각 객체배열에 접근해
					// Getter메소드를 통해 객체의 이름을 불러와 검색한 이름과 같은지 확인
					if(phone[i].getName().equals(search_name)) { 
						System.out.println(search_name + "의 번호는 " 
											+ phone[i].getTel() + "입니다.");
						found = true; // 이름을 찾았으니 found값을 true로 변경
					} else {
						continue;
					}
				}
				
				if(!found) { // found값이 변동 없이 false라면 이름을 찾지 못한 것
					System.out.println(search_name + " 이름은 없습니다.");
				}
			} else if (choice == 3) { // 프로그램 종료
				System.exit(0);
			}
		}
	}
}
