package com.mulcam.typing_game.model;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class WordsDAO {
	SqlSession session;
	
	public WordsDAO() {
		session = MySqlSession.getSqlSession();
	}
	public String select (int i) {
		

		int no = (int)(Math.random()*15)+1+i;
		
//		session.selectOne("words.select");
//		session.selectOne("words.select", Object param);
		
		String e = session.selectOne("words.select", no);
		return e;
	}
}
