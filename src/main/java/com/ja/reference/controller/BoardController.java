package com.ja.reference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ja.reference.service.BoardService;
import com.ja.reference.vo.BoardVo;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardservice;

	// 컨트롤러에서 기본적인 매핑을 진행한다.
	@RequestMapping("/read_content_page.do")
    
	public String mainPage(int b_no, Model model) {
        // 서비스에 만든 메소드 실행 
		BoardVo boardVo = boardservice.getContent(b_no);

		model.addAttribute("boardVo", boardVo);

		return "read_content_page";

	}
    // insert 매핑 테스트 
	@RequestMapping("/insert_content_page.do")
	
	public void insert_page(BoardVo ccc) {
		
	boardservice.insert(ccc);

	}

}
