package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

//public class PlayView {
//	public static void main(String[] args) {
//		new Play_Frame();
//	}
//}

public class PlayView extends JFrame {
	
	JPanel LowerPanel, UpperPanel, PlayPanel;
//	
	JTextField input_text = new JTextField (40);
	JLabel lifeLabel, levelLabel, scoreLabel, bestLabel, timeLabel, noticeLabel;
//	
	BorderLayout bd = new BorderLayout();
//	
	public JButton backButton;
	JButton overButton;
//	
	int sec = 60;
	
	boolean isitthefirst = true;
	boolean onlyfortimer = true;
	
	Drop d = new Drop();
	
	public PlayView() {
				
		LowerPanel = new JPanel ();
		UpperPanel = new JPanel ();
		PlayPanel = new JPanel ();
		
		lifeLabel = new JLabel ("Life : ★ ★ ★");
		levelLabel = new JLabel ("Level : ★ ★ ★");
		scoreLabel = new JLabel ("Score : ★ ★ ★");
		bestLabel = new JLabel ("Best Score : ★ ★ ★");
		timeLabel = new JLabel ("Time Left");
		
		backButton = new JButton(" << ");
	//UpperPanel============================
	UpperPanel.setLayout(new FlowLayout(1,20,10));

	UpperPanel.add(backButton);
	UpperPanel.add(levelLabel);
	UpperPanel.add(scoreLabel);
	UpperPanel.add(bestLabel);
	UpperPanel.add(timeLabel);
	
	UpperPanel.setBackground(Color.BLACK);
	
	levelLabel.setForeground(Color.white);
	scoreLabel.setForeground(Color.white);
	bestLabel.setForeground(Color.white);
	timeLabel.setForeground(Color.white);
	
	// PlayPanel=============================
	
	PlayPanel.setLayout(null);
	   d.setBounds(0, 0, 100, 30);
	  PlayPanel.add(d);
	  
	  new Thread(d).start();
	
	noticeLabel = new JLabel("시작하려면 아무 글자나 입력해주세요");
	noticeLabel.setFont(new Font("굴림", Font.BOLD, 20));
	noticeLabel.setHorizontalAlignment(SwingConstants.CENTER);
	noticeLabel.setBounds(105, 247, 383, 60);
	PlayPanel.add(noticeLabel);
	
	overButton = new JButton("Next Round");
	overButton.setBounds(228, 277, 137, 44);
	PlayPanel.add(overButton);
	overButton.setVisible(false);
	
	// LowerPanel============================
	
	LowerPanel.add(input_text);
	LowerPanel.add(lifeLabel);
	
	// Timer =================================
	
	Timer timer= new Timer(1000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			if(sec>0)
			{sec--;
			timeLabel.setText("" + sec);
			timeLabel.setFont(new Font("굴림", Font.BOLD, 20));}
		if(sec<10) {timeLabel.setForeground(Color.red);};	
		}
	});
	
	Timer round_over= new Timer(10000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
		overButton.setVisible(true);

		}
	});
	// Textfield ==============================
	
	input_text.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			timer.start();
			round_over.start();
			noticeLabel.setVisible(false);
			input_text.setText("");
		}
	});
	
	//프레임 성격 ==============================
	
	getContentPane().add(UpperPanel, bd.NORTH);
	getContentPane().add(LowerPanel, bd.SOUTH);
	getContentPane().add(PlayPanel);
	
	setSize(600,700);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	setVisible(false);
		
	}
}





































