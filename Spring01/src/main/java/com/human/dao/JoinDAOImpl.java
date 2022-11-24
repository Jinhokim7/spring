package com.human.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.JoinVO;

@Repository
public class JoinDAOImpl implements IF_joinDAO {
	
	private static String mapperQuery="com.human.dao.IF_joinDAO"; //매핑 인터페이스 경로설정

	
	@Inject   //컨테이너에서 자료형과 맞는 객체의 주소를 주입해준다.
	private SqlSession sqlSession;  //SqlSession 타입의 객체는 스프링 컨테이너에있다.
									// 여기서 이 객체가 필요하다. 그런데 컨테이너에서 가져와야한다. 스프링은 DI개념
	@Override
	public void joinOne(JoinVO joinvo) throws Exception {
		sqlSession.insert(mapperQuery+".joinOne",joinvo);//쿼리를 매핑및 실행한다..
		
	}

}
