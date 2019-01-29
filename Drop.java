package game;

import javax.swing.JLabel;

public class Drop extends JLabel implements Runnable{
	 
	public Drop() {
		setText("가나다");
	}
	@Override
	public void run() {
		
		while (true) {
			int i = (int) (Math.random()*550+1);
			for (int j = 0; j < 700; j += 10) {
				
				setLocation ( i ,j );
				try {
					Thread.sleep(100 - 2*(PlayView.sec / 5) ); // 수정한 부분
									// 5의 배수의 시간이 흐를 때마다 점점 속도증가
					//System.out.println("ch");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}//run
}
