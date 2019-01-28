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
//	
	JTextField input_text = new JTextField (40);
	JLabel lifeLabel, levelLabel, scoreLabel, bestLabel, timeLabel;
//	
	BorderLayout bd = new BorderLayout();
//	
	JButton backButton;
//	
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
		timeLabel = new JLabel ("Time Left : ");
		
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
	
	
	// LowerPanel============================
	
	LowerPanel.add(input_text);
	LowerPanel.add(lifeLabel);
	
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