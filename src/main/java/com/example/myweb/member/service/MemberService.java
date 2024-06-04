package com.example.myweb.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.example.myweb.member.MemberDao;

public abstract class MemberService {
	
	@Autowired
	public MemberDao memberDao;
	
	public abstract void process(Model model);
	
	
}
