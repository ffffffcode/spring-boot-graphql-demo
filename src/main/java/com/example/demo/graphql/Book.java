package com.example.demo.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Integer id;
	private String name;
	private Author author;
	private String publisher;

}