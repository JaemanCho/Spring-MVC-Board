package com.javalec.springMVCBoard.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.util.Constant;

public class BListService extends BAbstractService {

	@Override
	public void execute(Model model) {
		BDao dao = sqlSession.getMapper(BDao.class);
		model.addAttribute("list", dao.list());
	}

}