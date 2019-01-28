package com.mulcam.typing_game.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputForm extends JFrame {
	JLabel la_id;
	public JTextField tf_id;

	public JButton bt_submit, bt_cancel;

	public InputForm() {
		setTitle("�Է���");
		la_id = new JLabel("�̸�");

		tf_id = new JTextField();

		bt_submit = new JButton("�Է�");
		bt_cancel = new JButton("���");

		setLayout(null);

		la_id.setBounds(30, 30, 40, 30);

		tf_id.setBounds(70, 30, 80, 30);

		bt_submit.setBounds(30, 180, 60, 30);
		bt_cancel.setBounds(100, 180, 60, 30);

		add(la_id);
		add(tf_id);
		add(bt_submit);
		add(bt_cancel);

		setBounds(620, 220, 200, 280);
		 setVisible(false);
		setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// ������

	public void initForm() {// �Է��� �ʱ�ȭ
		setTitle("�Է���");
		bt_submit.setText("�Է�");

		tf_id.setText("");

		tf_id.requestFocus();
	}// initForm

	public void showMsg(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}// showMsg
}
