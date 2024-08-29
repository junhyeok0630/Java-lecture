package exam;

import java.util.Scanner;

class Man {
	public String name;
	public int a;
	public int b;
	
	public void myInfo() {
		System.out.println("이름 : " + name);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}
}

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 매개변수와 return
		 * 
		 * 매개변수
		 * - 특정 기능을 수행하기 위한 메소드는 기능을 수행할 때 사용할
		 * 인수를 받을 수 있다.
		 * - 매개변수는 개수에 제한이 없다.
		 * - 2개 이상의 매개변수를 정의할 때는 콤마(,)를 이용해서 나열한다.
		 */
		Man man = new Man();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력 >> ");
		man.name = sc.nextLine();
		
		System.out.println("숫자입력 >> ");
		man.a = sc.nextInt();
		
		System.out.println("숫자입력 >> ");
		man.b = sc.nextInt();
		
		System.out.println("저의 이름은 : " + man.name + "이고");
		System.out.println("사칙연산을 할 수 있어요");
		System.out.println(man.a + " + " + man.b + " = " + man.add(man.a, man.b));
		System.out.println(man.a + " - " + man.b + " = " + man.sub(man.a, man.b));
		System.out.println(man.a + " * " + man.b + " = " + man.mul(man.a, man.b));
		System.out.println(man.a + " / " + man.b + " = " + man.div(man.a, man.b));	
	}
}
