package com.mulcam.typing_game.model;



public class GamerVO {
  //DB테이블(member)의 레코드(행row)를 표현하는 클래스 
	private String id;
	private int score;
	public GamerVO() {
		// TODO Auto-generated constructor stub
	}

	public GamerVO(String id, int score) {
		super();
		this.score = score;
		this.id = id;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
