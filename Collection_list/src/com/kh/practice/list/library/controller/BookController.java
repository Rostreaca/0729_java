package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List list = new ArrayList();
	
	public BookController() {};
	
	public void insertBook(Book bk) {
		list.add(bk);
		
	}
	public ArrayList selectList() {
		
		ArrayList<Book> bookList = new ArrayList(); 
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getClass() == Book.class) {
				Book b = (Book) list.get(i);				
				bookList.add(b);
			}			
		}
		
		return bookList;
	}
	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList();
		
		
		for(int i=0; i<list.size();i++) {
			Book b = (Book)list.get(i);
			if(b.getTitle().contains(keyword)) {
				searchList.add((Book)list.get(i));
			}
			
		}
		
		
		return searchList;
	}
	public Book deleteBook(String title, String author)
	{
		Book remove = null;
		
		for(int i=0; i<list.size();i++) {
			Book b = (Book)list.get(i);
			if(b.getTitle().equals(title)&&b.getAuthor().equals(author)) {
				remove = b;
				break;
			}
			
		}
		
		return remove;
	}
	
	public int ascBook() {
		
		
		
		return 1;
	}
}
