package com.mulcam.typing_game.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.mulcam.typing_game.view.InputForm;
import com.mulcam.typing_game.view.MainView;
import com.mulcam.typing_game.view.PlayView;
import com.mulcam.typing_game.view.RankingView;

public class Controller implements ActionListener {
	MainView mainView;
	InputForm form;
	PlayView play;
	RankingView rank;
	
	public Controller() {
		mainView = new MainView();
		form = new InputForm();
		play = new PlayView();
		rank = new RankingView();
		eventUp();
	}

	private void eventUp() {// 이벤트 등록
		// ----mainView----
		//mainView.btn_input.addActionListener(this);        ---  정보입력 버튼 / 나중에 게임 끝나고 불러오자
		mainView.btn_rainfall.addActionListener(this);

		// ----inputForm----
		form.bt_submit.addActionListener(this);
		// -----playview-----
		play.btn_back.addActionListener(this);

		// 입력폼의 우측상단 'X'버튼 클릭시 메인화면으로 이동
		form.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				form.setVisible(false);
				mainView.setVisible(true);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {// 이벤트 처리부(요청 분석)
		Object ob = e.getSource();// 이벤트 소스의 레퍼런스 얻어오기
		
		
//		if (ob == mainView.btn_input) {//                  메인뷰 입력버튼 클릭 / 나중에 게임 끝나고 불러오자
//			mainView.setVisible(false);
//			form.setVisible(true);
//		} else if (ob == form.bt_submit) {// 입력폼 입력버튼 클릭
//			// from : 입력폼 뷰, to : DB
//			String id = form.tf_id.getText();
//			int score = 0;
//			GamerVO vo = new GamerVO(id, score);
//
//			GamerDAO dao = new GamerDAO();
//			if (dao.insert(vo)) {
//				form.showMsg("입력성공!!");
//				form.setVisible(false);
//				mainView.setVisible(true);
//			}
//		} 
		
		
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
