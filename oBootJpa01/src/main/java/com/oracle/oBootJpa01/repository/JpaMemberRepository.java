package com.oracle.oBootJpa01.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.oracle.oBootJpa01.domain.Member;

import jakarta.persistence.EntityManager;

@Repository
public class JpaMemberRepository implements MemberRepository {
	//jpa에서 dml작업할떄 쓰여지는 객체! dml작업할떄 EntityManager는 필수
	private final EntityManager em;
	public JpaMemberRepository(EntityManager em) {
		this.em = em;
		
	}
	
	@Override
	public Member memberSave(Member member) {
		//저장 method
		em.persist(member);
		System.out.println("JpaMemberRepository memberSave member after..");
		return member;
	}

	@Override
	public List<Member> findAllMember() {
		List<Member> memberList =em.createQuery("select m from Member m",Member.class) //객체멤버 jpa, select m= 에 Member.class 를  ,select m from Member m(jpql 문법), 
																						//from Member m테이블이 아니라 객체 =>현재 프로젝트 domain 엔티티 라는 객체
									.getResultList() //get얻다Result결과값을List 리스트 형태로 =결과값을 list형식으로 얻는다.
									;
		System.out.println("JpaMemberRepository findAllMember memberList.size()->" + memberList.size());
		return memberList;
	}

	@Override
	public List<Member> findByNames(String searchName) {
		String pname = searchName +'%';  //'%' sql like문장
		System.out.println("JpaMemberRepository findByNames pname->"+pname);
		List<Member> memberList =em.createQuery("Select m from Member m where name Like :name"
							, Member.class)
				.setParameter("name", pname)
				.getResultList()
				;
		System.out.println("JpaMemberRepository memberList.size()->" +memberList.size());
		return memberList;
	}

}
