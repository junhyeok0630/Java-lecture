package book;

public class Comic extends Book	{
	
	public Comic(String title, String author) {
		super(title,author);
	}
	
//	@Override
//	void info_title() {
//		System.out.println("만화책의 제목은 " + title + " 입니다.");
//	}
	
	@Override
	void info_author() {
		System.out.println("만화책의 저자는 " + author + " 입니다.");
	}
}
