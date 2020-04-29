package com.ja.reference.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ja.reference.mapper.BoardSQLMapper;
import com.ja.reference.vo.BoardVo;

@Service

public class BoardService {
  
	// 서비스 파트 변수명을 직관적이 아닌 범용적인 형태로 작성하는 것이 좋다. 
	@Autowired
	private BoardSQLMapper boardSQLMapper;
	
	public BoardVo getContent (int b_no) {
	
    return boardSQLMapper.selectByNo(b_no);
   
	  
  }
	public void insert(BoardVo aaa) {
		
		boardSQLMapper.insert(aaa);
	}
	
}
