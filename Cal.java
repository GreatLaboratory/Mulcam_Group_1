package calculating;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.mulcam.typing_game.view.Drop;
import com.mulcam.typing_game.view.PlayView;

public class Cal extends Thread {
	private int life = 3;
		
	
	PlayView playView;
	
	
	public Cal(PlayView playView) {				// PlayView 클래스와 연결
		this.playView=playView;
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
		default:
			playView.la_life.setText("END") ;
		
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
