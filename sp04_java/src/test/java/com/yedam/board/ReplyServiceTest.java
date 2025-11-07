package com.yedam.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;

@SpringJUnitConfig(classes = { DataSourceConfig.class, MybatisConfig.class, RootConfig.class })

public class ReplyServiceTest {
	@Autowired ReplyService replyService;
	
	
	@Test
	public void 등록() {
	ReplyVO reply = new ReplyVO();
	reply.setReply("댓글등록테스트");
	reply.setReplyer("홍길동");
	reply.setBno(15l);
	int result = replyService.insert(reply);
	assertEquals(result,1);
	}
	@Disabled
	@Test 
	public void 삭제() {
		ReplyVO reply = new ReplyVO();
		reply.set("rno", 3l);
		reply.set("result", "");
		replyService.delete(reply);
		System.out.println("result=" + reply.put("result"));
		
	}
//	@Test
//	public void 전체조회() {
//		List<ReplyVO> reply = new ReplyVO();
//	}
}
