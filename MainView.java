package com.mulcam.typing_game.view;
//package game;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainView extends JFrame {

	private JPanel contentPane;
	public JButton  btn_rainfall, btn_rank; // 랭킹 버튼 추가함
	private JLabel EnglishTypingGame;

	/**
	 * Create the frame.
	 */
	public MainView() {
		
		setResizable(false);
		setTitle("English Typing Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		EnglishTypingGame = new JLabel("English Typing Game");
		EnglishTypingGame.setFont(new Font("굴림", Font.PLAIN, 50));
		EnglishTypingGame.setHorizontalAlignment(SwingConstants.CENTER);
		EnglishTypingGame.setBounds(206, 32, 646, 175);
		contentPane.add(EnglishTypingGame);

		btn_rainfall = new JButton("RainFall Game");
		btn_rainfall.setFont(new Font("굴림", Font.PLAIN, 20));
		btn_rainfall.setBounds(184, 542, 185, 118);
		contentPane.add(btn_rainfall);

		btn_rank = new JButton("Ranking View"); // 랭킹보기위한 버튼 추가
		btn_rank.setFont(new Font("굴림", Font.PLAIN, 20));
		btn_rank.setBounds(594, 542, 185, 118);
		contentPane.add(btn_rank);

		setVisible(true);
	}
}
