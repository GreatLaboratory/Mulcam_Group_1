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
	
	public Cal(PlayView playView) {				// PlayView Ŭ������ ����
		this.playView=playView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		input = e.getActionCommand();
		//System.out.println("action Input="+ input);		// GUI���� ���� �Է¹޴´�.
		if(!input.equals(drop)) {
			setLife(getLife() - 1);
			 
			int N = getLife() ; 			//������� ���� LABEL ���� ����
			switch (N) {
			case 3:
				playView.la_life.setText("Life : �� �� ��");
				//add(la);
				break;
			case 2:
				playView.la_life.setText("Life : �� ��");
				break;
			case 1:
				playView.la_life.setText("Life : ��");
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
