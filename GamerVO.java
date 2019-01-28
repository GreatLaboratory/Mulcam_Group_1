package com.mulcam.typing_game.model;



public class GamerVO {
  //DB테이블(member)의 레코드(행row)를 표현하는 클래스 
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
