package com.mulcam.typing_game.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.mulcam.typing_game.model.GamerDAO;
import com.mulcam.typing_game.model.GamerVO;
import com.mulcam.typing_game.view.InputForm;
import com.mulcam.typing_game.view.MainView;
import com.mulcam.typing_game.view.PlayView;

public class Controller implements ActionListener{
	MainView mainView;
	InputForm form;
	PlayView play;
	public Controller() {
		mainView = new MainView();
		form = new InputForm();
		play = new PlayView();
		eventUp();
	}
	
	private void eventUp(){//�̺�Ʈ ���
		
		   //----play view----//
		   play.backButton.addActionListener(this);
		
		   //----mainView----
		   mainView.btn_input.addActionListener(this);
		   mainView.btn_rainfall.addActionListener(this);
		   
		   //----inputForm,upForm----
		   form.bt_submit.addActionListener(this);
		   
		   //�Է����� ������� 'X'��ư Ŭ����  ����ȭ������ �̵�
		   form.addWindowListener(new WindowAdapter() {
			   @Override
			  public void windowClosing(WindowEvent e) {
				  form.setVisible(false);
				  mainView.setVisible(true);
			  }
		   });
	   }

	public void actionPerformed(ActionEvent e) {// �̺�Ʈ ó����(��û �м�)
		Object ob = e.getSource();// ��z��Ʈ �ҽ��� ���۷��� ������
		if (ob == mainView.btn_input) {// ���κ� �Է¹�ư Ŭ��
			mainView.setVisible(false);
			form.setVisible(true);
		} else if (ob == form.bt_submit) {// �Է��� �Է¹�ư Ŭ��
			// from : �Է��� ��, to : DB
			String id = form.tf_id.getText();

			GamerVO vo = new GamerVO(0, id);

			GamerDAO dao = new GamerDAO();
			if (dao.insert(vo)) {
				form.showMsg("�Է¼���!!");
				form.setVisible(false);
				mainView.setVisible(true);
			}
		} 
		else if (ob == mainView.btn_rainfall) {// ���κ� �񳻸��� ��ư Ŭ��
			mainView.setVisible(false);
			play.setVisible(true);
		}
		
		else if (ob == play.backButton) {
			mainView.setVisible(true);
			play.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new Controller();
	}
}
