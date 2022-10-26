package com.example.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Library;
import com.example.demo.Service.OnetoManyService;

@RestController
public class OnetoManyController {

	private static Logger log = LoggerFactory.getLogger(OnetoManyController.class);


	@Autowired
	private OnetoManyService onetoManyService;

	@PostMapping("/libraryDetails")
	public ResponseEntity<Library> saveToData(@RequestBody Library library) {
		 log.info("details ==",library.toString());
		 log.info("records saved sucessfully" + library.getBook());
		 log.info("Library saved" + library.getName() + " " + library.getAddress());
		 Library libraryreocrd=	onetoManyService.saveDataRecords(library);
		return new  ResponseEntity<>(libraryreocrd,HttpStatus.CREATED);
	}

	@GetMapping(value = "/getBookDetails")
	public ResponseEntity<List<Library>> getLibrary() {
		return new ResponseEntity<List<Library>>(onetoManyService.getLibrary(),HttpStatus.CREATED);
	}

}


