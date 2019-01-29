package calculating;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import com.mulcam.typing_game.view.PlayView;

public class Cal implements ActionListener {
	private int life = 3;

	public static String input;		
	public static String drop ; 
	
	PlayView playView;
	
	public Cal(PlayView playView) {				// PlayView 클래스와 연결
		this.playView=playView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		input = e.getActionCommand();
		//System.out.println("action Input="+ input);		// GUI에서 값을 입력받는다.
		if(!input.equals(drop)) {
			setLife(getLife() - 1);
			 
			int N = getLife() ; 			//목숨값에 따라서 LABEL 수정 가능
			switch (N) {
			case 3:
				playView.la_life.setText("Life : ★ ★ ★");
				//add(la);
				break;
			case 2:
				playView.la_life.setText("Life : ★ ★");
				break;
			case 1:
				playView.la_life.setText("Life : ★");
				break;
			default:
				playView.la_life.setText("END") ; 
				break;
			}
		}//if
		playView.input_text.setText("");
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
