package book;

public class Book {
	
	public String title; 
	public String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	final void info_title() { // 메소드를 final로 선언 오버라이딩 불가능
		System.out.println("책의 제목은 " + title + "입니다.");
	}
	
	void info_author() {
		System.out.println("책의 저자는 " + author + "입니다.");
	}
}
