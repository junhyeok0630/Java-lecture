package exam;

import java.awt.Toolkit;

class BeepoTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음
			try {
				Thread.sleep(500); // 0.5초간 대기
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}

public class Example12 {
	public static void main(String[] args) {
		/*
		 * 멀티스레드를 이용한 경우 동시작업이 가능하다 
		 */
		Runnable beepTask = new BeepoTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초간 대기
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
