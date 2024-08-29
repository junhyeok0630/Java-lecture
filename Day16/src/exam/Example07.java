package exam;

// 버튼 클릭 이벤트를 지닌 인터페이스 선언
interface buttonClickListener {
	public void click();
}

class AnontmousExample {
	
	// 버튼 객체를 내부 클래스로 선언
	public class Button {
		private buttonClickListener listener;
		
		// 특정 리스너를 외부로부터 받는 메소드
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		/*
		 * 버튼을 클릭하는 이벤트
		 * 즉) 어떤 이벤트가 들어왔을 때만 동작하도록 제어
		 */
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
}

public class Example07 {
	public static void main(String[] args) {
		// 외부 클래스를 통해서 버튼 클래스 선언
		AnontmousExample exam = new AnontmousExample();
		AnontmousExample.Button button = exam.new Button();
		
		button.setButtonListener(new buttonClickListener() {
			
			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("버튼 클릭");
			}
		});
		button.click();
	}
}
