package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {

		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

			if (mc.existMemberNum() != mc.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch (menuNo) {
			case 1:
				if (mc.existMemberNum() != mc.SIZE) {
					insertMember();
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertMember() {
		String id = "";
		while (true) {
			System.out.print("회원 등록할 아이디를 입력해주세요 : ");
			id = sc.nextLine();
			if (mc.checkId(id)) {
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String password = sc.nextLine();
		System.out.println("이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		char gender = ' ';
		while (true) {
			System.out.println("성별을 입력해주세요 : ");
			gender = sc.nextLine().charAt(0);
			if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
				break;
			} else {
				System.out.println("성별을 다시 입력하세요");
			}
		}
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();

		mc.insertMember(id, name, password, email, gender, age);

		System.out.println("등록이 완료되었습니다.");
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch (menuNo) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력해주십시오 > ");
		String id = sc.nextLine();
		if (mc.searchId(id) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 조회 결과입니다.");
			System.out.println(mc.searchId(id));
		}
	}

	public void searchName() {
		System.out.print("검색할 이름을 입력해주십시오 > ");
		String name = sc.nextLine();
		
		Member[] members = mc.searchName(name);
		
		if(members[0] != null) {
			for(int i =0; i<members.length;i++) {
				System.out.println(members[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
		/*
		if (mc.searchName(name) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 조회 결과입니다.");
			for (int i = 0; i < mc.searchName(name).length; i++) {
				if (mc.searchName(name)[i] != null && mc.searchName(name)[i].getName().equals(name)) {
					System.out.println(mc.searchName(name)[i].inform());
				}
			}
		}
		*/
	}

	public void searchEmail() {
		System.out.print("검색할 이메일을 입력해주십시오 > ");
		String email = sc.nextLine();
		
		Member[] members = mc.searchEmail(email);
		
		if(members[0] !=null) {
			for(int i =0; i<members.length;i++) {
				System.out.println(members[i].inform());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
		
		/*
		if (mc.searchEmail(email) == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 조회 결과입니다.");
			for (int i = 0; i < mc.searchEmail(email).length; i++) {
				if (mc.searchEmail(email)[i] != null && mc.searchEmail(email)[i].getEmail().equals(email)) {
					System.out.println(mc.searchEmail(email)[i].inform());
				}
			}
		}
		*/
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기 ");
		System.out.println("2. 이름 수정하기 ");
		System.out.println("3. 이메일 수정하기 ");
		System.out.println("9. 메인으로 돌아가기 ");
		System.out.print("메뉴 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch (menuNo) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

	}

	public void updatePassword() {
		//아이디, 비밀번호, 바꿀 비밀번호 입력
		// 아이디 , 비밀번호 일치 시 -> 기존 비밀번호 => 바꿀 비밀번호
		// 아이디, 비밀번호 중 하나라도 일치 x => 안바꿈
		
		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();
		
		System.out.print("기존 비밀번호를 입력하세요 > ");
		String userPw = sc.nextLine();
		
		System.out.print("새 비밀번호를 입력하세요 > ");
		String newPassword = sc.nextLine();
		
		boolean result = mc.updatePassword(userId, userPw, newPassword);
		
		if(result) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다.");
			System.out.println("입력값을 다시 확인해주세요");
		}
		
		/* 과제 =>
		System.out.print("수정할 아이디를 입력해주세요 :");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호를 입력해주세요 : ");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id, password)!=false) {
			mc.updatePassword(id, password);
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		*/
	}

	public void updateName() {
		System.out.print("수정할 아이디를 입력해주세요 :");
		String id = sc.nextLine();
		System.out.print("수정할 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		if(mc.updateName(id, name)!=false) {
			mc.updateName(id, name);
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void updateEmail() {
		System.out.print("아이디를 입력해주세요 :");
		String id = sc.nextLine();
		System.out.print("수정할 이메일을 입력해주세요 : ");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id, email)!=false) {
			mc.updateEmail(id, email);
			System.out.println("수정이 성공적으로 되었습니다.");
			return;
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		switch (menuNo) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			return;
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(Y/N) >");
		char check = sc.nextLine().charAt(0);
		if (check == 'Y' || check == 'y') {
			if (mc.delete(id) != false) {
				mc.delete(id);
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			} else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(Y/N) >");
		char check = sc.nextLine().charAt(0);
		if (check == 'Y' || check == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			return;
		}
	}

	public void printAll() {
		if (mc.printall() != null) {
			for (int i = 0; i < mc.printall().length; i++) {
				if (mc.printall()[i] != null) {
					System.out.println(mc.printall()[i].inform());
				}
			}
		} else {
			System.out.println("저장된 회원이 없습니다.");
		}
	}
}
