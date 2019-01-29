package com.mulcam.typing_game.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainView extends JFrame {

	private JPanel contentPane;
	public JButton btn_longtext, btn_rainfall;
	//public JButton btn_input;               ---  정보입력 버튼 / 나중에 게임 끝나고 불러오자
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

		btn_longtext = new JButton("Long Text Game");
		btn_longtext.setFont(new Font("굴림", Font.PLAIN, 20));
		btn_longtext.setBounds(709, 542, 185, 118);
		contentPane.add(btn_longtext);

//		btn_input = new JButton("ID 입력");                   ---  정보입력 버튼 / 나중에 게임 끝나고 불러오자
//		btn_input.setFont(new Font("굴림", Font.PLAIN, 20));
//		btn_input.setBounds(387, 271, 273, 83);
//		contentPane.add(btn_input);

		setVisible(true);
	}
}
