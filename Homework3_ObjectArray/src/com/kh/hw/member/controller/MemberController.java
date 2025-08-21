package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	// static 블럭 //클래스가 올라갈 때 한 번만 수행됨 static -> 초기화 -> 생성자
	static{
	
	}
	// 초기화 블럭
	{
		m[0] = new Member("admin","관리자","ad1234","admin@kh.com",'M',100);
	}
	
	public int existMemberNum() {
		int memberCount = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				memberCount++;
			}
		}
		return memberCount;
	}

	public Boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}

	}

	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
	}

	public Member[] searchName(String name) { // ??
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;
		for (int i = 0; i < m.length ; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				members[index++] = m[i];
				
			}
		}
		return members;
	}

	public Member[] searchEmail(String email) { // ??
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index =0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getEmail().equals(email)) {
				members[index++] = m[i];
			}
		}
		return members;
	}

	/*
	public Boolean updatePassword(String id, String password) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
   */
	
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		// 전달받은 3개의 값을 가지고
		// 비밀번호를 바꿔주거나 바꿔주지 않거나
		
		// 배열의 첫번째 요소 아이디값 비교 
		for(int i =0; i<m.length;i++) {
			if(m[0] != null && m[0].getId().equals(userId) && m[0].getPassword().equals(userPw)) {
				m[0].setPassword(newPassword);
				return true;
			}
		}
		return false;
		
	}
	public Boolean updateName(String id, String name) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	public Boolean updateEmail(String id, String email) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}

	public Boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public Member[] printall() {
		
		if (existMemberNum() == 0) {
			return null;
		} else {
			return m;
		}
	}
}
