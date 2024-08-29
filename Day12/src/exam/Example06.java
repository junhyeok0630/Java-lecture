package exam;

import java.util.Scanner;

class Book1 {
	private String title;
	private String author;
	
	public Book1(String title, String author) {
		this.title = title;
		this.author = author;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

public class Example06 {
	public static void main(String[] args) {
		Book1[] book = new Book1[2]; // 객체 배열 생성
		/*
		 * 자바에서는 기본 타입 데이터뿐만 아니라, 객체를 원소로 하는 객체배열도 만들 수 있다.
		 * 자바의 객체 배열은 객체에 대한 레퍼런스(참조값)을 원소로 갖는 배열이다.
		 */
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) { // 배열을 돌면서
			System.out.println("제목 >> ");
			String title = sc.nextLine();
			System.out.println("저자 >> ");
			String author = sc.nextLine();
			book[i] = new Book1(title, author); // 각 배열마다 객체 생성(객체의 참조값 할당)
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].getTitle() + ", " 
					+ book[i].getAuthor() + ")");
		}
	}
}
