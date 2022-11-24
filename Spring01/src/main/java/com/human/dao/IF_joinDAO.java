package com.human.dao;

import com.human.vo.JoinVO;

public interface IF_joinDAO {
	public void joinOne(JoinVO joinvo) throws Exception;  //서비스 단에서 호출할 메서드+ 매핑에 사용될 메서드
}
