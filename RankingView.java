package com.mulcam.typing_game.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class RankingView extends JFrame {

	private JPanel contentPane;
	JLabel la_ranking, la_first, la_second, la_third, la_forth;
	JLabel la_first_id, la_second_id, la_third_id, la_forth_id;
	JLabel la_first_score, la_second_score, la_third_score, la_forth_score;
	public JButton btn_main;
	
	public JLabel[] la_id;
	public JLabel[] la_score;
	
	
	
	
	/**
	 * Create the frame.
	 */
	public RankingView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 537, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		//------------------여긴 바뀌지않는 고정 문자----------------------------
		la_ranking = new JLabel("Ranking");
		la_ranking.setHorizontalAlignment(SwingConstants.CENTER);
		la_ranking.setFont(new Font("굴림", Font.PLAIN, 60));
		la_ranking.setBounds(103, 72, 307, 115);
		contentPane.add(la_ranking);
		
		 la_first = new JLabel("1st");
		la_first.setFont(new Font("굴림", Font.PLAIN, 30));
		la_first.setHorizontalAlignment(SwingConstants.CENTER);
		la_first.setBounds(14, 231, 99, 64);
		contentPane.add(la_first);
		
		 la_second = new JLabel("2nd");
		la_second.setHorizontalAlignment(SwingConstants.CENTER);
		la_second.setFont(new Font("굴림", Font.PLAIN, 30));
		la_second.setBounds(24, 307, 89, 64);
		contentPane.add(la_second);
		
		 la_third = new JLabel("3rd");
		la_third.setHorizontalAlignment(SwingConstants.CENTER);
		la_third.setFont(new Font("굴림", Font.PLAIN, 30));
		la_third.setBounds(34, 383, 79, 64);
		contentPane.add(la_third);
		
		 la_forth = new JLabel("4th");
		la_forth.setHorizontalAlignment(SwingConstants.CENTER);
		la_forth.setFont(new Font("굴림", Font.PLAIN, 30));
		la_forth.setBounds(24, 459, 99, 64);
		contentPane.add(la_forth);
		
		//------------------DB에서 ID 받아오기-----------------------
		
		la_first_id = new JLabel("NULL");
		la_first_id.setFont(new Font("굴림", Font.PLAIN, 30));
		la_first_id.setHorizontalAlignment(SwingConstants.CENTER);
		la_first_id.setBounds(127, 231, 207, 64);
		contentPane.add(la_first_id);
		
		la_second_id = new JLabel("NULL");
		la_second_id.setHorizontalAlignment(SwingConstants.CENTER);
		la_second_id.setFont(new Font("굴림", Font.PLAIN, 30));
		la_second_id.setBounds(127, 307, 207, 64);
		contentPane.add(la_second_id);
		
		la_third_id = new JLabel("NULL");
		la_third_id.setHorizontalAlignment(SwingConstants.CENTER);
		la_third_id.setFont(new Font("굴림", Font.PLAIN, 30));
		la_third_id.setBounds(127, 383, 207, 64);
		contentPane.add(la_third_id);
		
		la_forth_id = new JLabel("NULL");
		la_forth_id.setHorizontalAlignment(SwingConstants.CENTER);
		la_forth_id.setFont(new Font("굴림", Font.PLAIN, 30));
		la_forth_id.setBounds(127, 459, 207, 64);
		contentPane.add(la_forth_id);
		
		//-----------------------DB에서 SCORE 받아오기---------------------------
		la_first_score = new JLabel("NULL");
		la_first_score.setHorizontalAlignment(SwingConstants.CENTER);
		la_first_score.setFont(new Font("굴림", Font.PLAIN, 30));
		la_first_score.setBounds(336, 231, 148, 64);
		contentPane.add(la_first_score);
		
		la_second_score = new JLabel("NULL");
		la_second_score.setHorizontalAlignment(SwingConstants.CENTER);
		la_second_score.setFont(new Font("굴림", Font.PLAIN, 30));
		la_second_score.setBounds(336, 307, 148, 64);
		contentPane.add(la_second_score);
		
		la_third_score = new JLabel("NULL");
		la_third_score.setHorizontalAlignment(SwingConstants.CENTER);
		la_third_score.setFont(new Font("굴림", Font.PLAIN, 30));
		la_third_score.setBounds(336, 383, 148, 64);
		contentPane.add(la_third_score);
		
		la_forth_score = new JLabel("NULL");
		la_forth_score.setHorizontalAlignment(SwingConstants.CENTER);
		la_forth_score.setFont(new Font("굴림", Font.PLAIN, 30));
		la_forth_score.setBounds(336, 459, 148, 64);
		contentPane.add(la_forth_score);
		
		btn_main = new JButton("main으로 돌아가기");
		btn_main.setBounds(160, 603, 184, 36);
		contentPane.add(btn_main);
		
		
		setVisible(false);
		
		toArray();
	}
	
    private void toArray() {
		
		JLabel[] temp_id = {la_first_id, la_second_id, la_third_id, la_forth_id};
		JLabel[] temp_score = {la_first_score, la_second_score, la_third_score, la_forth_score};
		
		la_id = temp_id;
		la_score = temp_score;
		
	}
}
