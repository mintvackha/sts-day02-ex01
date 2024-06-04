package com.example.myweb.member;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myweb.member.service.MemberService;

@Controller
public class MemberController {
	
	private static final Logger logger=LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private MemberService memberService;

	//using fields
	@RequestMapping(value = "/member/list.do", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {
		logger.info("GET memberList()-MemberController", locale);

		memberService.process(model);
		
		return "member/list";
		
	}
	@RequestMapping(value = "/member/input.do", method = RequestMethod.GET)
	public String memberInput(Locale locale, Model model) {
		logger.info("GET memberInput()-MemberController", locale);
		
		return "member/input";
		
	}
	@RequestMapping(value = "/member/input.do", method = RequestMethod.POST)
	public String memberInputOk(Locale locale, Model model, MemberDto dto) {
		logger.info("POST memberInput()-MemberController", locale);
		memberDao.insert(dto);
		
		return "redirect:list.do";
		
	}
	@RequestMapping(value="/member/detail.do", method=RequestMethod.GET)
	public String memberDetail(MemberDto dto, Locale locale, Model model) {
		logger.info("GET memberDetail()-MemberController", locale);
		MemberDto member=memberDao.findById(dto);
		model.addAttribute("member", member);
		
		return "member/detail";
	}
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.GET)
	public String memberEdit(Locale locale, Model model, MemberDto dto) {
		logger.info("GET memberEdti()-MemberController", locale);
		MemberDto member=memberDao.findById(dto);
		model.addAttribute("member", member);
		
		return "member/edit";
		
	}
	@RequestMapping(value = "/member/edit.do", method = RequestMethod.POST)
	public String memberEditOk(Locale locale, Model modelm, MemberDto dto) {
		logger.info("POST memberEditOk()-MemberController", locale);
		memberDao.update(dto);
		
		return "redirect:list.do";
		
	}
	@RequestMapping(value = "/member/delete.do", method = RequestMethod.GET)
	public String memberEdlete(Locale locale, Model model, MemberDto dto) {
		logger.info("GET memberDelete()-MemberController", locale);
		MemberDto member=memberDao.findById(dto);
		model.addAttribute("member", member);
		
		return "member/delete";
		
	}
	@RequestMapping(value = "/member/delete.do", method = RequestMethod.POST)
	public String memberEdleteOk(Locale locale, Model model, MemberDto dto) {
		logger.info("POST memberDeleteOk()-MemberController", locale);
		memberDao.delete(dto);
		
		return "redirect:list.do";
		
	}
}
