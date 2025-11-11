package com.example.demo.board.service;

import java.util.List;
import java.util.Map;

public interface ReplyService {
	//전체조회
	List<ReplyVO>getList(long bno);
	//등록
	int insert(ReplyVO reply);
	//삭제
	int delete(long rno);
}
