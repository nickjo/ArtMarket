package org.art.inside.controller;

import org.apache.log4j.Logger;
import org.art.inside.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
//@SessionAttributes("board")
public class BoardController {
	@Autowired
	BoardService boardServiceImpl;
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="board.do", method=RequestMethod.GET)
	public String getBoard(Model model){
		log.info("############ getBoard() ###############");
		log.info(boardServiceImpl.getBoard());
		model.addAttribute("board", boardServiceImpl.getBoard());
		return "board";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getMain(Model model){
		log.info("getMain()");
		return "login/login";
	}
	
	@RequestMapping(value="main.do", method=RequestMethod.POST)
	public String removeMainPage(){
		log.info("removeMainPage()");
		return "main/main";
	}
}
