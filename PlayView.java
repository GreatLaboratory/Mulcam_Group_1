package com.mulcam.typing_game.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//public class PlayView {
//	public static void main(String[] args) {
//		new Play_Frame();
//	}
//}

public class PlayView extends JFrame {
	
	JPanel LowerPanel, UpperPanel, PlayPanel;
	
	JTextField input_text;
	JLabel la_life, la_level, la_score, la_best, la_time;
	
	BorderLayout bd = new BorderLayout();
	
	public JButton btn_back;
	
	boolean isitthefirst = true;
	boolean onlyfortimer = true;
	
	public PlayView() {
		LowerPanel = new JPanel ();
		UpperPanel = new JPanel ();
		PlayPanel = new JPanel ();
		input_text = new JTextField (40);
		
		la_life = new JLabel ("Life : ★ ★ ★");
		la_level = new JLabel ("Level : ★ ★ ★");
		la_score = new JLabel ("Score : ★ ★ ★");
		la_best = new JLabel ("Best Score : ★ ★ ★");
		la_time = new JLabel ("Time Left : ");
		
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
	
	
	// LowerPanel============================
	
	LowerPanel.add(input_text);
	LowerPanel.add(la_life);
	
//	input_text.addActionListener(this); <-- 얘가 문제!
	//프레임 성격 ==============================
	
	add(UpperPanel, bd.NORTH);
	add(LowerPanel, bd.SOUTH);
	
	setSize(600,700);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	setVisible(false);
		
	}

	
//    public void timer() {
//    int k = 60;
//    while(true)
//    {
//    	TimerLabel.setText(""+k);
//    	try {
//    		Thread.sleep(1000);
//    	} catch (InterruptedException e) {
//    		e.printStackTrace();
//    	}
//    	k--; ;
//    }
//	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		timer();  <-- 얘가 문제!!! 
//	}

}
