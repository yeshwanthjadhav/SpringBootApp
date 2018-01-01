package com.test.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.TestBook;
import com.test.service.TestService;

@RestController
public class Test {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/")
	public String sayHello(){
		return "Hello";
	}
	
	@RequestMapping("/books")
	public List<TestBook> getAllBooks(){
		return testService.getAllBooks();
	}
	
	@RequestMapping("/book/{id}")
	public TestBook getBook(@PathVariable String id){
		return testService.getBook(id);
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public void addBook(@RequestBody TestBook book){
		testService.addBook(book);
	}
	
	@RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
	public void updateBook(@RequestBody TestBook book, @PathVariable String id){
		testService.updateBook(id, book);
	}

	@RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable String id){
		testService.deleteBook(id);
	}
	
}
