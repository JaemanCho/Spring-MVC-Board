package com.javalec.springMVCBoard.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dto.BDto;

public class BListService implements BService {

	@Override
	public void execute(Model model) {

		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);

	}

}