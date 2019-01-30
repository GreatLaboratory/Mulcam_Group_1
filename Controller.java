package com.mulcam.typing_game.control;
package game;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import com.mulcam.typing_game.model.GamerDAO;
//import com.mulcam.typing_game.model.GamerVO;
//import com.mulcam.typing_game.view.InputForm;
//import com.mulcam.typing_game.view.MainView;
//import com.mulcam.typing_game.view.PlayView;


import game.*;

public class Controller implements ActionListener {
	MainView mainView;
	//InputForm form;
	PlayView play;
	RankingView rank; // 랭킹 
	
	public Controller() {
		mainView = new MainView();
	//	form = new InputForm();
		play = new PlayView();
		rank = new RankingView(); // 랭킹
		eventUp();
	}

	private void eventUp() {// 이벤트 등록
		
		// ----mainView----
		//mainView.btn_input.addActionListener(this);        ---  정보입력 버튼 / 나중에 게임 끝나고 불러오자
		mainView.btn_rainfall.addActionListener(this);

		// ----rankingView----
		mainView.btn_rank.addActionListener(this); // 메인에서 랭킹 볼 수 있게 추가해놈
		rank.btn_main.addActionListener(this);
		
		// -----playview-----
		play.btn_back.addActionListener(this);

		// 랭킹뷰의 우측상단 'X'버튼 클릭시 메인화면으로 이동
		rank.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				rank.setVisible(false);
				mainView.setVisible(true);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {// 이벤트 처리부(요청 분석)
		Object ob = e.getSource();// 이벤트 소스의 레퍼런스 얻어오기
		
		if (ob == mainView.btn_rank) {// 랭킹 버튼 클릭
			mainView.setVisible(false);
			rank.setVisible(true);
		} 
		else if (ob == rank.btn_main) { 
			mainView.setVisible(true);
			rank.setVisible(false);
		}
		if (ob == mainView.btn_rainfall) {// 메인뷰 비내리기 버튼 클릭
			mainView.setVisible(false);
			play.setVisible(true);
		} else if (ob == play.btn_back) {
			mainView.setVisible(true);
			play.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new Controller();
	}
}
