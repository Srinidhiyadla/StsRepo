package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
