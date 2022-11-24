package com.human.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.human.vo.BoardVO;

@Repository //dao 단임을 알려준다..
public class BoardDAOImpl implements IF_boardDAO{
	//sping의 DAO 와 mybais sqlsession을 연결하는 객체
	
	private static String mapperQuery="com.human.dao.IF_boardDAO"; //매핑 인터페이스 경로설정
	
	//mybatis의 sqlSession 객체가 필요
	
	@Inject   //컨테이너에서 자료형과 맞는 객체의 주소를 주입해준다.
	private SqlSession sqlSession;  //SqlSession 타입의 객체는 스프링 컨테이너에있다.
									// 여기서 이 객체가 필요하다. 그런데 컨테이너에서 가져와야한다. 스프링은 DI개념
	
	@Override
	public void insertOne(BoardVO boardvo) throws Exception {
		sqlSession.insert(mapperQuery+".insertOne",boardvo);//쿼리를 매핑및 실행한다..
		           // <insert //매핑정보 //id //parameter
		
	}

}
