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

import game.Drop;

//public class PlayView {
//	public static void main(String[] args) {
//		new Play_Frame();
//	}
//}

public class PlayView extends JFrame {
	
	JPanel LowerPanel, UpperPanel, PlayPanel;
	
	JTextField input_text;
	JLabel la_life, la_level, la_score, la_best, la_time, la_notice;
	
	BorderLayout bd = new BorderLayout();
	
	public JButton btn_back;
	JButton btn_over;
	
	int sec = 10;
	
	boolean isitthefirst = true;
	boolean onlyfortimer = true;
	
	public PlayView() {
		
		Drop d = new Drop();
		
		LowerPanel = new JPanel ();
		UpperPanel = new JPanel ();
		PlayPanel = new JPanel ();
		input_text = new JTextField (40);
		la_life = new JLabel ("Life : ★ ★ ★");
		la_level = new JLabel ("Level : ★ ★ ★");
		la_score = new JLabel ("Score : ★ ★ ★");
		la_best = new JLabel ("Best Score : ★ ★ ★");
		la_time = new JLabel ("Time Left");
		
		btn_back = new JButton(" << ");
	//UpperPanel============================
	UpperPanel.setLayout(new FlowLayout(1,20,10));

	UpperPanel.add(btn_back);
	UpperPanel.add(la_level);
	UpperPanel.add(la_score);
	UpperPanel.add(la_best);
	UpperPanel.add(la_time);
	
	UpperPanel.setBackground(Color.BLACK);
	
	la_level.setForeground(Color.white);
	la_score.setForeground(Color.white);
	la_best.setForeground(Color.white);
	la_time.setForeground(Color.white);
	
	// PlayPanel=============================
	
	PlayPanel.setLayout(null);
	d.setBounds(0, 0, 100, 30);
	PlayPanel.add(d);
	  
	new Thread(d).start();
	
	PlayPanel.setLayout(null);
	
	la_notice = new JLabel("시작하려면 아무 글자나 입력해주세요");
	la_notice.setFont(new Font("굴림", Font.BOLD, 20));
	la_notice.setHorizontalAlignment(SwingConstants.CENTER);
	la_notice.setBounds(105, 247, 383, 60);
	PlayPanel.add(la_notice);
	
	btn_over = new JButton("Next Round");
	btn_over.setBounds(228, 277, 137, 44);
	PlayPanel.add(btn_over);
	btn_over.setVisible(false);
	
	// LowerPanel============================
	
	LowerPanel.add(input_text);
	LowerPanel.add(la_life);
	
	// Timer =================================
	
	Timer timer= new Timer(1000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			if(sec>0)
			{sec--;
			la_time.setText("" + sec);
			la_time.setFont(new Font("굴림", Font.BOLD, 20));}
		if(sec<10) {la_time.setForeground(Color.red);};	
		}
	});
	
	Timer round_over= new Timer(10000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			btn_over.setVisible(true);

		}
	});
	// Textfield ==============================
	
	input_text.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			timer.start();
			round_over.start();
			la_notice.setVisible(false);
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
