package com.javalec.springMVCBoard.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.util.Constant;

abstract class BAbstractService  implements BService {

	public SqlSession sqlSession;

	public BAbstractService() {
		sqlSession = Constant.sqlSession;
	}

	@Override
	abstract public void execute(Model model);
}
