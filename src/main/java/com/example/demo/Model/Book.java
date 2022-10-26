package com.example.demo.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Record")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	@Column(name = "book_name")
	private String name;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="book_Library",referencedColumnName = "Library_id")

	private Library library;



	public Book() {
		super();
	}

	public Book(int id, String name, Library library) {
		super();
		this.id = id;
		this.name = name;
		this.library = library;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", library=" + library + "]";
	}

}
