package com.human.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_boardDAO;
import com.human.dao.IF_joinDAO;
import com.human.vo.BoardVO;
import com.human.vo.JoinVO;


@Service
public class BoardServiceImpl implements IF_bosrdService{
	
	@Inject
	private IF_boardDAO boarddao;

	

	@Override
	public void insertOne(BoardVO boardvo) throws Exception {
		
		boarddao.insertOne(boardvo);
		
	}



}
