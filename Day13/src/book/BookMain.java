package book;

class Book {
	String title;
	int price;
	
	void info() {
		System.out.println("책의 제목은 " + title + "이고, 가격은 " + price +"원입니다.");
	}
}
class ComicBook extends Book {
	// 멤버 및 메소드 상속
}
public class BookMain {
	public static void main(String[] args) {
		/*
		 * ComicBook 클래스에서 구현하지 않은 멤버와 메소드들이지만
		 * Book 클래스를 상속받았기 때문에
		 * Book에 있는 요소들을 사용할 수 있다.
		 */
		ComicBook comicbook = new ComicBook();
		comicbook.title = "포켓몬"; // book클래스의 멤버를 comicbook이 상속받아 접근
		comicbook.price = 4500; //  book클래스의 멤버를 comicbook이 상속받아 접근
		comicbook.info(); // book클래스의 메소드를 comicbook이 상속받아 접근
	}
}
