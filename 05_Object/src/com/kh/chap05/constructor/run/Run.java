package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Member member = new Member();
		System.out.println(member.info());
		
		
		Member member2 = new Member("길동"); //생성자 호출
		           //객체생성 / 객체의 초기 상태 설정

		Member member3 = new Member("user01","1234");
		System.out.println(member3.info());
		
		Member member4 = new Member("user02","pass02","홍길동");
		System.out.println(member4.info());
		
	}
}
