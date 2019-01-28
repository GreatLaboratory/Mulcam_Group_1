package com.mulcam.typing_game.model;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class GamerDAO {// DB���� Ŭ���� (DAO: DataBase Access Object)
	// ---> CRUD �۾� Create(insert) Read(select) Update Delete

	SqlSession session;

	public GamerDAO() {
		session = MySqlSession.getSqlSession();
	}

	public boolean insert(GamerVO vo) {
		// session.insert("���ӽ����̽���.���̵��", Object parameter);
		session.insert("gamer.insert", vo);
		session.commit();
		return true;
	}
}
