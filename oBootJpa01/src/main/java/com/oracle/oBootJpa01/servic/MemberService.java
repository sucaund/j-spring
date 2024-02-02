package com.oracle.oBootJpa01.servic;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.oBootJpa01.domain.Member;
import com.oracle.oBootJpa01.repository.MemberRepository;

@Service
@Transactional //springframework.transaction.annotation.Transactional 의 라이브러리로,@@데이터베이스에서 데이터를 처리하는 하나의 논리적인 작업 단위를 의미 --일관성--
public class MemberService {

	private final MemberRepository memberRepository;
	
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}


	//회원가입
	public long memberSave (Member member) {
		System.out.println("MemberService MemberSave member (해시코드이다...)==>" + member);
		memberRepository.memberSave(member);
		System.out.println("MemberServicememberSavr after...");
		return member.getId();
	}


	public List<Member> getListAllMember() {
		List<Member> listmember = memberRepository.findAllMember();
		System.out.println("MemberService getListAllMember  listmember.size() ->" + listmember.size());
		return listmember;
		
	}


	public List<Member> getListSearchMember(String searchName) {
		System.out.println("MemberService getListSearchMember Start");
		System.out.println("MemberService getListSearchMember searchName  "+searchName );
		List<Member> listMember = memberRepository.findByNames(searchName);
		System.out.println("MemberService getListSearchMember listMember.size()"+ listMember.size());
		return listMember;
	}
	
	
}
