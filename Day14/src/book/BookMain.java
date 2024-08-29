package book;

public class BookMain {
	public static void main(String[] args) {
		Comic comicbook	= new Comic("주머니 괴물", "미상");
		comicbook.info_title();
		
		comicbook.title = "자바의 정석";
		comicbook.info_title();
	}
}
