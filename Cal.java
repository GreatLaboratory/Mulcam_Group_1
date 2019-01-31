package calculating;
//package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import game.PlayView;
import game.Drop;
public class Cal extends Thread {
	private int life = 3;
	InputForm inputForm;
	GamerVO gamervo;
	PlayView playView;
	static int SCORE;
	
	
	public Cal(PlayView playView,InputForm inputForm) {				// PlayView 클래스와 연결
		this.playView=playView;
		this.inputForm=inputForm;
	}
	public void life_cut() {	
		
		setLife(getLife() - 1);
		 
		int N = getLife() ; 			//목숨값에 따라서 LABEL 수정 가능
		switch (N) {
		case 3:
			playView.la_life.setText("Life : ★ ★ ★");
			
			//add(la);
			break;
		case 2:
			playView.la_life.setText("Life : ★  ★ ");
			break;
		case 1:
			playView.la_life.setText("Life :  ★ ");
			break;
		case 0:
		
			//String sec = PlayView.sec+"";
			SCORE = PlayView.sec;
			
			playView.la_life.setText("END") ;
			playView.la_notice.setVisible(true);
			playView.la_notice.setText("GAME OVER    TIME : " + SCORE + " sec");
//			inputForm.setVisible(true);
			System.out.println("sec>>>"+SCORE);
			//System.out.println("gamervo>>>"+gamervo);//null
			//gamervo.setScore(sec);
			
			//control.callBackScore(sec); //컨트롤러에게 점수 알려주기
			
			
			//System.out.println("T = "+gamervo.getScore());
			
			inputForm.setVisible(true);
			playView.d_array[0].setVisible(false);
			playView.d_array[1].setVisible(false);
			playView.d_array[2].setVisible(false);
			playView.d_array[3].setVisible(false);
			break;
		default :

			break;
			}
			
	}
			
	public void LifeView() {
		int N = getLife();
				
	}	

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

}
