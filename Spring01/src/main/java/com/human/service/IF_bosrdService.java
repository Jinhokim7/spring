package com.human.service;

import com.human.vo.BoardVO;
import com.human.vo.JoinVO;

public interface IF_bosrdService {
	public void insertOne(BoardVO boardvo) throws Exception; //컨트롤러에서 호출할 메서드..
//	public void joinOne(JoinVO joinvo)throws Exception;
	
}
