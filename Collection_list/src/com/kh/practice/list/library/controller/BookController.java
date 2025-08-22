package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	private List<Book> list = new ArrayList();

	public BookController() {
	};

	public void insertBook(Book bk) {
		list.add(bk);

	}

	public ArrayList selectList() {

		ArrayList<Book> bookList = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getClass() == Book.class) {
				bookList.add(list.get(i));
			}
		}

		return bookList;
	}

	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			Book b = list.get(i);
			if (b.getTitle().contains(keyword)) {
				searchList.add(b);
			}

		}

		return searchList;
	}

	public Book deleteBook(String title, String author) {
		for (int i = 0; i < list.size(); i++) {
			Book b = list.get(i);
			if (b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				list.remove(i);
				return b;
			}

		}

		return null;
	}

	public int ascBook() {
		List<Book> books = list;

		return 1;
	}
}
