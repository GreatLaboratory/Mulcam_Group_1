package com.mulcam.typing_game.model;



public class GamerVO {
  //DB���̺�(member)�� ���ڵ�(��row)�� ǥ���ϴ� Ŭ���� 
	private int no;
	private String id;
	
	public GamerVO() {
		// TODO Auto-generated constructor stub
	}

	public GamerVO(int no, String id) {
		super();
		this.no = no;
		this.id = id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
