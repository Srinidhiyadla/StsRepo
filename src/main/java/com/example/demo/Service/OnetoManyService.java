package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Model.Library;
import com.example.demo.Repository.LibraryRepository;

@Service
public class OnetoManyService {

	@Autowired
	private LibraryRepository libraryRepository;


	public Library saveDataRecords(Library library) {
for(Book bookdetails:library.getBook()) {
	bookdetails.setLibrary(library);
	
}
		return libraryRepository.save(library);
	}


	public List<Library> getLibrary() {
		return (List<Library>) libraryRepository.findAll();
	}





	
}

