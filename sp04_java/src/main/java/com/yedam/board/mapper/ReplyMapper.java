package com.yedam.board.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.board.service.BoardVO;
import com.yedam.board.service.ReplyVO;

public interface ReplyMapper {
	//전체조회
	List<ReplyVO>getList(long bno);
	//등록
	int insert(ReplyVO reply);
	//삭제
	int delete(long rno);
	
}
