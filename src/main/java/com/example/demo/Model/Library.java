package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Library_Record")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Library_id")
	private int id;
	@Column(name = "Library_name")
	private String name;
	@Column(name = "Library_address")
	private String address;

	//targetEntity = Book.class
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "library")

	private List<Book> book;



	public Library() {
		super();
	}

	public Library(int id, String name, String address, List<Book> book) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.book = book;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", address=" + address + ", book=" + book + "]";
	}

}