package com.board.study;

import java.security.SecureRandom;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.board.study.dto.board.BoardResponseDto;
import com.board.study.dto.board.BoardRequestDto;
import com.board.study.service.BoardService;

@SpringBootTest
class BoardStudyApplicationTests {

	@Autowired
	private BoardService boardService;
	
	@Test
	void save() {
	}
	
}
