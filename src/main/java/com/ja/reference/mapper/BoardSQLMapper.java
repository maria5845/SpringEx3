package com.ja.reference.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.ja.reference.vo.BoardVo;

public interface BoardSQLMapper {
	
	// DAO 객체를 생성하는 단계 
    @Select("SELECT * FROM fb_board WHERE b_no = #{no} ") // setInt를 대신하여 받아오는 파라미터값을 지정하기 위해 #{매개변수명 } 로 지정 
	public BoardVo selectByNo(int no);
    
    @Select("SELECT * FROM fb_board")
    public ArrayList<BoardVo> selectAll();
    
    
    @Insert("INSERT INTO fb_board VALUES(fb_board_seq.nextval,#{m_no},#{b_title},#{b_content},SYSDATE,0)")
    public void insert(BoardVo aaa); // 매개변수를 Vo로 설정하는 이유는 m_no, b_title, b_content 를 사용하기 위함 
    
}
