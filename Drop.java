package com.mulcam.typing_game.view;

import javax.swing.JLabel;

public class Drop extends JLabel implements Runnable {
	WordsDAO dao;
	
//	int i = (int) (Math.random() * 550 + 1);
	int j =0;
	
	public Drop() {
		dao = new WordsDAO();
		setText(dao.select());
		
	}

	@Override
	public void run() {
		try {
		while (!Thread.currentThread().isInterrupted()) {
			int i = (int) (Math.random() * 550 + 1);
			for ( j = 0; j < 700; j += 1) {

				setLocation(i, j);
				
					Thread.sleep(100- 5*(PlayView.sec / 5)); // 수정한 부분
//					Thread.sleep(200 - (PlayView.sec / 5) ); // 수정한 부분
					// 5의 배수의 시간이 흐를 때마다 점점 속도증가
					// System.out.println("ch");
			}}
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		} // run
	
