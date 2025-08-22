package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {

		while (true) {
			System.out.println("== Welcome KH Library ==");

			System.out.println("******** 메인 메뉴 *********");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴번호 선택 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch (menuNo) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertBook() {
		String category = "";
		System.out.print("도서명을 입력해주세요 >");
		String title = sc.nextLine();
		System.out.print("저자명을 입력해주세요 >");
		String author = sc.nextLine();
		System.out.print("장르를 입력해주세요(1.인문 / 2.자연과학 / 3.의료 / 4.기타) > ");
		int categoryNo = sc.nextInt();
		sc.nextLine();

		switch (categoryNo) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "자연과학";
			break;
		case 3:
			category = "의료";
			break;
		case 4:
			category = "기타";
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다. 메뉴로 돌아갑니다.");
			return;
		}
		System.out.print("가격을 입력해주세요 > ");
		
		int price = 0;
		try {
			price = sc.nextInt();
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
		
		Book b = new Book(title, author, category, price);
		bc.insertBook(b);
		
		System.out.println("도서가 추가되었습니다.");
	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}

	public void searchBook() {
		System.out.print("검색할 도서명의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book b : searchList) {
				System.out.println(b);
			}
		}
		
	}

	public void deleteBook() {
		System.out.print("삭제할 도서명을 입력해주세요 > ");
		String title = sc.nextLine();
		System.out.print("삭제할 도서의 저자명을 입력해주세요 > ");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}

	public void ascBook() {
		
		int result = bc.ascBook();
		
		if(result == 0) {
			System.out.println("정렬에 실패하였습니다.");
		} else {			
			System.out.println("정렬이 완료되었습니다.");
		}
	}

}
