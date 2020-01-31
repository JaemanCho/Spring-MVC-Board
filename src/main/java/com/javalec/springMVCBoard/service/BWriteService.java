package com.javalec.springMVCBoard.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;


public class BWriteService extends BAbstractService {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		BDao dao = sqlSession.getMapper(BDao.class);
		dao.write(bName, bTitle, bContent);
	}
}
