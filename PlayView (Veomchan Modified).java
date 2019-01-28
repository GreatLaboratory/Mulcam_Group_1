package com.mulcam.typing_game.view;

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
	int sec = 10;
	
	boolean isitthefirst = true;
	boolean onlyfortimer = true;
	
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

class drop extends JLabel implements Runnable{
	
	JLabel drop1, drop2, drop3, drop4, drop5;
	
	public drop(JPanel on) {
		
		drop1.setText("첫 번째 문자");
		drop1.setBounds((int)(Math.random()), 0, 20, 10);
		drop2.setText("첫 번째 문자");
		drop2.setBounds((int)(Math.random()), 0, 20, 10);
		drop3.setText("첫 번째 문자");
		drop3.setBounds((int)(Math.random()), 0, 20, 10);
		drop4.setText("첫 번째 문자");
		drop4.setBounds((int)(Math.random()), 0, 20, 10);
		drop5.setText("첫 번째 문자");
		drop5.setBounds((int)(Math.random()), 0, 20, 10);
		
		on.add(drop1);
		on.add(drop2);
		on.add(drop3);
		on.add(drop4);
		on.add(drop5);
	}

	@Override
	public void run() {
	}
}


































