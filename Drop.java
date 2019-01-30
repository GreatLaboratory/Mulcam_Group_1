package com.mulcam.typing_game.view;

import java.awt.Font;

import javax.swing.JLabel;

import com.mulcam.typing_game.model.WordsDAO;

//import calculating.Cal;

public class Drop extends JLabel implements Runnable {
	WordsDAO dao;
	
//	int i = (int) (Math.random() * 550 + 1);
	int j =0;
	Cal c ;
	public Drop(Cal c,int i) {
		this.c= c;
		dao = new WordsDAO();
		setText(dao.select(i*15));	
	}

	@Override
	public void run() {//단어 떨어진다.
		try {
		while (!Thread.currentThread().isInterrupted()) {
			int i = (int) (Math.random() * 550 + 1);
			for ( j = 0; j < 620; j += 1) {
				if(j == 580) {
					c.life_cut();
				}
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
