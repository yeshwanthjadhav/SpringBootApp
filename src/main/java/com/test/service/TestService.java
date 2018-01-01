package com.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.model.TestBook;

@Service
public class TestService {

	private List<TestBook> books = new ArrayList<>(Arrays.asList(
			new TestBook("Java","Java 8","Java Description"),
			new TestBook("Spring","SpringBoot","Spring Description"),
			new TestBook("AngularJS","Angularjs4","Angular Description")
			));
	
	
	public List<TestBook> getAllBooks(){
		return books;
	}
	
	public TestBook getBook(String id){
		return books.stream().filter(t -> t.getId().equals(id)).findFirst().get(); 
	}
	
	public void addBook(TestBook book){
		books.add(book);
	}
	
	public void updateBook(String id, TestBook book){
		for(int i=0; i< books.size(); i++){
			TestBook t =  books.get(i);
			if(t.getId().equals(id)){
				books.set(i, book);
				return;
			}
		}		
	}
	
	public void deleteBook(String id){
		books.removeIf(t -> t.getId().equals(id));
	}
	
	
}
