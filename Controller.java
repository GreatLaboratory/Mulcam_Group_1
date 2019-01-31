package com.mulcam.typing_game.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import com.mulcam.typing_game.model.Cal;
import com.mulcam.typing_game.model.GamerDAO;
import com.mulcam.typing_game.model.GamerVO;
import com.mulcam.typing_game.view.InputForm;
import com.mulcam.typing_game.view.MainView;
import com.mulcam.typing_game.view.PlayView;
import com.mulcam.typing_game.view.RankingView;

public class Controller implements ActionListener {
	MainView mainView;
	InputForm form;
	PlayView play;
	RankingView rank; // 랭킹 
	
	public Controller() {
	
		form = new InputForm();
		play = new PlayView(form);
		rank = new RankingView(); // 랭킹
		mainView = new MainView();
		eventUp();
	}

	
	private void eventUp() {// 이벤트 등록
		
		// ----mainView----
		//mainView.btn_input.addActionListener(this);        ---  정보입력 버튼 / 나중에 게임 끝나고 불러오자
		mainView.btn_rainfall.addActionListener(this);

		// ----rankingView----
		mainView.btn_rank.addActionListener(this); // 메인에서 랭킹 볼 수 있게 추가해놈
		rank.btn_main.addActionListener(this);
		
		// -----InputForm------ 랭킹 정보 입력받음
		
		form.bt_cancel.addActionListener(this);
		form.bt_submit.addActionListener(this);
		
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

//		if (ob == mainView.btn_input) {//                  메인뷰 입력버튼 클릭 / 나중에 게임 끝나고 불러오자
//			mainView.setVisible(false);
//			form.setVisible(true);
//		}  
		if (ob == form.bt_submit) {// 입력폼 입력버튼 클릭
			// from : 입력폼 뷰, to : DB
			String id = form.tf_id.getText();
			//System.out.println(gamervo.getScore());
			//GamerVO vo = new GamerVO(id, gamervo.getScore());
			GamerVO vo = new GamerVO(id, Cal.SCORE); // 여기서 전달 받음
            
			
			
			GamerDAO dao = new GamerDAO();
			if (dao.insert(vo)) {
				form.showMsg("입력성공!!");
				form.setVisible(false);
				mainView.setVisible(true);
			}
			else form.showMsg("이름을 입력해주세요");
			//rank.setVisible(true);
		} 
		else if (ob == form.bt_cancel) { 
			mainView.setVisible(true);
			form.setVisible(false);
			
		}else if (ob == mainView.btn_rank) {// 랭킹 버튼 클릭
			GamerDAO dao = new GamerDAO();
			List<GamerVO> list= dao.select();
			
			for(int i=0; i<list.size(); i++) {
				rank.la_id[i].setText(list.get(i).getId());
				rank.la_score[i].setText(list.get(i).getScore()+"");
			}
			
			mainView.setVisible(false);
			rank.setVisible(true);
		} 
		else if (ob == rank.btn_main) { //다시 메인으로 돌아가야하는데 못하는 중
			mainView.setVisible(true);
			rank.setVisible(false);
		}
		else if (ob == mainView.btn_rainfall) {// 메인뷰 비내리기 버튼 클릭
			play.setVisible(true);
			mainView.setVisible(false);
		} 
		else if (ob == play.btn_back) {
			//mainView.setVisible(true);
			new Controller();
			play.setVisible(false);
		}
		
	}//actionPerformed

	
	
	public static void main(String[] args) {
		new Controller();
	}
}
