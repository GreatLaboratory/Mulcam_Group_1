package com.mulcam.typing_game.model;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import mybatis.MySqlSession;

public class GamerDAO {// DB전담 클래스 (DAO: DataBase Access Object)
	// ---> CRUD 작업 Create(insert) Read(select) Update Delete

	public String first_id, second_id, third_id, forth_id;
//	public int first_score, second_score, third_score, forth_score;
	public String first_score, second_score, third_score, forth_score;
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
	
	public List<GamerVO> select() {
		//GamerVO vo = new GamerVO();
		//session.selectOne("gamer.selectOne");  // 결과행이 하나의 행일 때
		RowBounds bounds = new RowBounds(0, 4);
		//session.selectList("패키지명.아이디명",Object param, bounds);
		//List<GamerVO> list =session.selectList("gamer.select",null, bounds);
		return session.selectList("gamer.select",null, bounds);
		
//		for(GamerVO vo:list) {
//			System.out.println("id>>>"+vo.getId());
//		}
		
//		this.first_id = list.get(0).getId();
//		this.second_id = list.get(1).getId();
//		this.third_id = list.get(2).getId();
//		this.forth_id = list.get(3).getId();
		
//		this.first_score = Integer.toString(list.get(0).getScore());
//		this.first_score = Integer.toString(list.get(1).getScore());
//		this.first_score = Integer.toString(list.get(2).getScore());
//		this.first_score = Integer.toString(list.get(3).getScore());
//		
		
		//List<String> list = session.selectList("names.selectAll"); // 결과행이 두 개 이상일 때
//		for(String e:list) {
//			System.out.println(" "+e);
//		}
	}
}
