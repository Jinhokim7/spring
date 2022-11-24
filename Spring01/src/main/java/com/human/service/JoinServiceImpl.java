package com.human.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.human.dao.IF_joinDAO;
import com.human.vo.JoinVO;

@Service
public class JoinServiceImpl implements IF_joinService{
	@Inject
	private IF_joinDAO joindao;

	@Override
	public void joinOne(JoinVO joinvo) throws Exception {
		
		joindao.joinOne(joinvo);
		
	}

}
