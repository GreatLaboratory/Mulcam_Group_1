package game;


import javax.swing.JButton;
import javax.swing.JFrame;

class MyButton1 extends JButton{ // 버튼 1 : 1버전으로 가게 될 버튼
	
}


class MyButton2 extends JButton{ // 버튼 2 : 2버전으로 가게 될 버튼
	
}




public class GameFrame extends JFrame { // 메인 프레임

public GameFrame() { // 생성자
	
	setSize(600, 700);
	setTitle("English Practice");
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} // 메인프레임 생성자
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameFrame();
	}

}
