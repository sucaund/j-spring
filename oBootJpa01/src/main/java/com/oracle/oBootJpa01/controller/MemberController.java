package com.oracle.oBootJpa01.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.oracle.oBootJpa01.domain.Member;
import com.oracle.oBootJpa01.servic.MemberService;

import ch.qos.logback.classic.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MemberController {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MemberController.class);
	private final MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping(value =  "/members/new")
	public String createForm() {
		return "members/createMemberForm";
	}
	
	@PostMapping(value =  "/members/save")
	public String memberSave(Member member) {
		System.out.println("MemberController memberSave start..");
		System.out.println("member.getId()=>"+member.getId());
		System.out.println("member.getName() =>"+member.getName());
		memberService.memberSave(member);
		return "redirect:";
	}
	@GetMapping(value =  "/members")
	public String listMember(Model model) {
		List<Member> memberList = memberService.getListAllMember();
		LOGGER.info("memberList size=>"+memberList.size());
		model.addAttribute("members",memberList);
		return "members/memberList";
	}
	@PostMapping(value = "members/search")
	public String memberSearch(Member member, Model model) {
		//TODO: process POST request
		System.out.println("members/search member.getName()->" +member.getName());
		
		List<Member> memberList = memberService.getListSearchMember(member.getName());
		System.out.println("MemberController members/search memberList.size()->" +memberList.size());
		
		System.out.println("MemberController memberSearch memberList->"+memberList.size());
		model.addAttribute("members",memberList);
		
		return "members/memberList";
	}
	
	
	
	
	
	
	
	
}
