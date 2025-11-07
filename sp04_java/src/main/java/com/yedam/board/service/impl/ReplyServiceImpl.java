package com.yedam.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

	private final ReplyMapper replyMapper;
	@Override
	public List<ReplyVO> getList(long bno) {
		return replyMapper.getList(bno);
	}

	@Override
	public int insert(ReplyVO reply) {
		return replyMapper.insert(reply);
	}

	@Override
	public int delete(long rno) {
		return replyMapper.delete(rno);
	}

}
