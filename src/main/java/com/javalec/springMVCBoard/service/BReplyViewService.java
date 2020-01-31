package com.javalec.springMVCBoard.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BReplyViewService extends BAbstractService {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");

		BDao dao = sqlSession.getMapper(BDao.class);
		BDto dto = dao.reply_view(bId);

		model.addAttribute("reply_view", dto);

	}

}
