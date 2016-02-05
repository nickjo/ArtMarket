package org.art.inside.service.impl;

import org.art.inside.domain.BoardVO;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class BoardServiceImplTest {
	
	@Test
	public void testGetBoard(){
		BoardServiceImpl bs = new BoardServiceImpl();
		
	 	List<BoardVO> list = bs.getBoard();
	 	
	 	assertNotNull("connect DB", list);
	}
	
	public static void main(String[] args){
		BoardServiceImplTest b = new BoardServiceImplTest();
		
		b.testGetBoard();
	}

}
