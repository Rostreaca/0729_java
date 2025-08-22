package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println("******메인메뉴*******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			switch (menuNo) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		}

	}

	public void addList() {
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 입력 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addList(music);

		if (result == 0) {
			System.out.println("추가 실패");
		} else {
			System.out.println("추가 성공!");
		}

	}

	public void addAtZero() {
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 입력 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);

		if (result == 0) {
			System.out.println("추가 실패");
		} else {
			System.out.println("추가 성공!");
		}

	}

	public void printAll() {
		List<Music> list = mc.printAll();
		if (list.isEmpty()) {
			System.out.println("곡이 없습니다.");
		} else {
			for (Music m : list) {
				System.out.println(m);
			}
		}
	}

	public void searchMusic() {
		System.out.print("곡 이름을 입력해주십시오 : ");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title);
		// 배열이 아니어서 가수가 다른 같은 제목의 곡은 출력되지 않음.
		// 선택지 1. 메소드 반환형을 배열로 변경
		// 선택지 2. 곡 추가 시 같은 제목의 곡은 가수가 다르더라도 추가 X
		// -> 2번으로 결정

		if (music == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색한 곡은 " + music.getSinger() + "의 " + music.getTitle() + " 입니다.");
		}
	}

	public void removeMusic() {
		System.out.print("삭제할 곡의 이름을 입력해주세요 : ");
		String title = sc.nextLine();

		Music remove = mc.removeMusic(title);

		if (remove == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.print(remove.getTitle() + "," + remove.getSinger() + "을(를) 삭제했습니다.");
		}

	}

	public void setMusic() {
		System.out.print("곡을 입력해주세요 : ");
		String title = sc.nextLine();
		System.out.print("가수를 입력해주세요 :");
		String singer = sc.nextLine();
		System.out.print("수정할 곡 제목을 입력해주세요 : ");
		String setTitle = sc.nextLine();

		Music music = new Music(title, singer);

		Music setMusic = mc.setMusic(setTitle,music);
		//곡명으로 검색 => 곡명, 가수명 변경? 
		//곡명, 가수명으로 검색 => 곡명만 변경? O
		// 곡명, 가수명으로 검색 => 곡명, 가수명 변경?

		if (setMusic == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println(singer+"의 "+title+"의 제목이 변경되었습니다.");
		}

	}

	public void ascTitle() {

	}

	public void descSinger() {

	}

}
