package com.mulcam.typing_game.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.mulcam.typing_game.model.WordsDAO;

public class PlayView extends JFrame {
	
	JPanel LowerPanel, UpperPanel, PlayPanel;
//	
	public JTextField input_text = new JTextField (40);
	public JLabel la_life,  la_level, la_score, la_best, la_time, la_notice; // public 추가
//	
	BorderLayout bd = new BorderLayout();
//	
	public WordsDAO dao;
	public JButton btn_back;
//	
	static int sec = 0; // 스테틱으로 해놔야됨
	
	boolean isitthefirst = false; // 원랜 false였음
	
	Cal c;// = new Cal(null) ;		// 채점 프로그램과 연결
	
	Drop d,d1,d2,d3;
	
	Drop [] d_array; 
	
	Thread [] t_array; 
	
	int sum = 0;
	int score = 0;
	
	public PlayView() {
		dao = new WordsDAO();
		LowerPanel = new JPanel ();
		UpperPanel = new JPanel ();
		PlayPanel = new JPanel ();
		
		
		c = new Cal(this); // 채점 연산자 
		
		 d = new Drop(c, 0);
		 d1 = new Drop(c, 1);
		 d2 = new Drop(c, 2);
		 d3 = new Drop(c, 3);
		
		 d_array =  new Drop[4];
		  d_array[0]=d;
		  d_array[1]=d1;
		  d_array[2]=d2;
		  d_array[3]=d3;
		  
		 t_array = new Thread[d_array.length];
		 for (int i = 0; i < d_array.length; i++) {
			 t_array[i]=new Thread(d_array[i]);
		 } 
		
		 
		la_life = new JLabel ("Life : ★ ★ ★");
		la_level = new JLabel ("Level : ★ ★ ★");
		la_score = new JLabel ("Score : ★ ★ ★");
		la_best = new JLabel ("Best Score : ★ ★ ★");
		la_time = new JLabel ("Time Left");
		
		la_best.setFont(new Font("굴림", Font.PLAIN, 15));
		la_score.setFont(new Font("굴림", Font.PLAIN, 15));
		la_time.setFont(new Font("굴림", Font.BOLD, 15));
		
		btn_back = new JButton(" << ");
		
	//UpperPanel============================
	UpperPanel.setLayout(new FlowLayout(1,20,10));

	UpperPanel.add(btn_back);
	UpperPanel.add( la_level);
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
		  for(Drop d : d_array) {
			  
		  d.setBounds(0,0,100,30);
		  PlayPanel.add(d);
		  d.setVisible(false);
	  }
		
	  d1.setText(dao.select(15));
	  d2.setText(dao.select(30));
	  d3.setText(dao.select(45));
	
	  la_notice = new JLabel("시작하려면 아무 글자나 입력해주세요");
	  la_notice.setFont(new Font("굴림", Font.BOLD, 20));
	  la_notice.setHorizontalAlignment(SwingConstants.CENTER);
	  la_notice.setBounds(105, 247, 383, 60);
	PlayPanel.add(la_notice);
	
	GroupLayout gl_UpperPanel = new GroupLayout(UpperPanel);
	gl_UpperPanel.setHorizontalGroup(
		gl_UpperPanel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_UpperPanel.createSequentialGroup()
				.addGap(24)
				.addComponent(btn_back)
				.addGap(27)
				.addComponent(la_best, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(la_score, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addComponent(la_time)
				.addGap(49))
	);
	gl_UpperPanel.setVerticalGroup(
		gl_UpperPanel.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_UpperPanel.createSequentialGroup()
				.addContainerGap()
				.addGroup(gl_UpperPanel.createParallelGroup(Alignment.BASELINE)
					.addComponent(la_best, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addComponent(btn_back)
					.addComponent(la_time, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addComponent(la_score, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	);
	UpperPanel.setLayout(gl_UpperPanel);
	
	
	// LowerPanel============================
	
	LowerPanel.add(input_text);
	LowerPanel.add(la_life);
	
	// Timer =================================
	
	Timer timer= new Timer(1000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			sec++;
			// 시간 이렇게 정한 이유는 그래야 간격이 좀 맞는 것 같아서, 수정해도 ㄱㅊ
			  if ( PlayView.sec==20)	 {t_array[1].start(); d_array[1].setVisible(true); }
			  if ( PlayView.sec==15)	 {t_array[2].start(); d_array[2].setVisible(true); }
			  if ( PlayView.sec==10) 	 {t_array[3].start(); d_array[3].setVisible(true); }
			  la_time.setText("" + sec);

		if(sec<10) {la_time.setForeground(Color.red);} 	
		}
	});
	

	// Textfield ==============================

	input_text.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String written ;
			if(!isitthefirst) {
				 t_array[0].start(); // 첫번째 쓰레드 시작!
				 isitthefirst = true;}

				 d.setVisible(true);
				 
			timer.start();
			la_notice.setVisible(false);
			
	//=====================================	


			written = e.getActionCommand();
			for( int i =0; i < 4; i++ ) {

			if(written.equals(d_array[i].getText())) {

				d_array[i].setLocation(0,0);
			//	d_array[i].setVisible(false);
				d_array[i].setText(dao.select(i*15));

				t_array[i].interrupt();
				t_array[i] = new Thread(d_array[i]);
				t_array[i].start();//첫번째 쓰레드~마지막쓰레드 시작!
				
				int dscore = e.getActionCommand().length();
				sum += dscore;
				score = sum * sec;
				la_score.setText("Score :" + score);
			}
			input_text.setText("");
	
	//=====================================
		
				
			
			}
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
