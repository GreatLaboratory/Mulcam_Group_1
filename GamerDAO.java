package com.mulcam.typing_game.model;

import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class GamerDAO {// DB전담 클래스 (DAO: DataBase Access Object)
	// ---> CRUD 작업 Create(insert) Read(select) Update Delete

	SqlSession session;

	public GamerDAO() {
		session = MySqlSession.getSqlSession();
	}

	public boolean insert(GamerVO vo) {
		// session.insert("네임스페이스명.아이디명", Object parameter);
		session.insert("gamer.insert", vo);
		session.commit();
		return true;
	}
}
