package org.art.inside.service.impl;

import java.util.List;
import java.util.Map;

import org.art.inside.dao.BoardMapper;
import org.art.inside.domain.BoardVO;
import org.art.inside.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getBoard() {
		// TODO Auto-generated method stub
		return boardMapper.getBoard();
	}

}
