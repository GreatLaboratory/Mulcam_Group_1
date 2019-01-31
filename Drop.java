package game;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import game.WordsDAO;
import game.Cal;

public class Drop extends JLabel implements Runnable {
	WordsDAO dao;

//	int i = (int) (Math.random() * 550 + 1);
	int j = 0;
	Cal c;

	public Drop(Cal c,int i) {
		this.c = c;
		dao = new WordsDAO();
		setText(dao.select(i*15));
		setFont(new Font("Sans", Font.BOLD, 20));

	}

	@Override
	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				int i = (int) (Math.random() * 550 + 1);
				for (j = 0; j < 620; j += 1) {
					if(j == 580) {
						c.life_cut();
					}
					  setBounds(i, j, 200, 30);

					Thread.sleep(5); // 수정한 부분
//					Thread.sleep(100 - (PlayView.sec)); // 수정한 부분
//					Thread.sleep(200 - (PlayView.sec / 5) ); // 수정한 부분
					// 5의 배수의 시간이 흐를 때마다 점점 속도증가
					// System.out.println("ch");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
} // run
