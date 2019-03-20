package com.example.demo.graphql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {
	
	public List<Book> findBooks() {
		Author author = new Author(1, "Bill Venners", 40);
		Book b = new Book(1, "scala编程第三版", author, "电子工业出版社");
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(b);
		return bookList;
	}
	
}